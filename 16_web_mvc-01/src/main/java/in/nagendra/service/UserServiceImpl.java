package in.nagendra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nagendra.entity.User;
import in.nagendra.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public boolean saveData(User user) {
		
		User saveUser = userRepo.save(user);
		
		return saveUser.getUid() != null ;
	}

	@Override
	public List<User> getAllUsers() {
		
		List<User> all = userRepo.findAll();
		return all;
	}

	
}
