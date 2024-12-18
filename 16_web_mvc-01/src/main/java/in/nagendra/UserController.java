package in.nagendra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.nagendra.entity.User;
import in.nagendra.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//open user form
	@GetMapping("/")
	public String loadForm(Model model) {
		User userObj = new User();
		
		model.addAttribute("user" ,userObj);
		
		return "form";
	}
	
	//handle form submit
	@PostMapping("/user")
	public String handleSubmit(User user ,Model model) {
		
		boolean isSaved = userService.saveData(user);
		
		if(isSaved) {
			model.addAttribute("smsg" ,"User saved");
		}else {
			model.addAttribute("emsg" ,"User is not Saved");
		}
		return "form";
	}
	
	//handle view-user page display
	@GetMapping("/users")
	public String getUsers(Model model) {
		List<User> allUsers = userService.getAllUsers();
		
		model.addAttribute("users" ,allUsers);
		return "users";
	}
	
	 @GetMapping("/edit")
	    public String editUser(@RequestParam("uid") Integer uid, Model model) {
		 
	        User user = userService.getUserById(uid);
	        
	        model.addAttribute("user", user);
	        
	        return "form"; 
	    }
	
	 
	 
	 @GetMapping("/delete")
	    public String deleteUser(@RequestParam("uid") Integer uid, Model model) {
		 
	        boolean isDeleted = userService.deleteUser(uid);
	        
	        if (isDeleted) {
	        	
	            model.addAttribute("smsg", "User deleted successfully");
	            
	        } else {
	        	
	            model.addAttribute("emsg", "User could not be deleted");
	        }
	        return "redirect:/users"; 
	    }
	
	

}
