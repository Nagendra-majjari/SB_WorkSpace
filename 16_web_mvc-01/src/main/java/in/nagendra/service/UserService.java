package in.nagendra.service;

import java.util.List;

import in.nagendra.entity.User;

public interface UserService {
	
	public boolean saveData(User user);

	public List<User> getAllUsers();

	
	
	
}