package in.nagendra.service;

import org.springframework.stereotype.Service;

import in.nagendra.entity.User;
import in.nagendra.repo.UserRepository;

@Service
public class UserService {

	private UserRepository userRepo;

	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
		System.out.println("Implementation Class ::" + userRepo.getClass().getName());
	}

	public void saveUser() {

		User u = new User();

		u.setId(1001);
		u.setName("nagendra");
		u.setGender("male");
		u.setCountry("INDIA");

		userRepo.save(u);

	}

	public void saveUsers() {
		User u1 = new User();

		u1.setId(1002);
		u1.setName("Nagaiah");
		u1.setGender("Male");
		u1.setCountry("USA");

		userRepo.save(u1);
		
		User u2 = new User();

		u2.setId(1003);
		u2.setName("Lakshmi Devi");
		u2.setGender("Female");
		u2.setCountry("USA");

		userRepo.save(u2);

		User u3 = new User();

		u3.setId(1005);
		u3.setName("Lakshmi");
		u3.setGender("Female");
		u3.setCountry("USA");

		userRepo.save(u3);

		User u4 = new User();

		u4.setId(1004);
		u4.setName("Ramana");
		u4.setGender("Male");
		u4.setCountry("INDIA");

		userRepo.save(u4);

	}

}
