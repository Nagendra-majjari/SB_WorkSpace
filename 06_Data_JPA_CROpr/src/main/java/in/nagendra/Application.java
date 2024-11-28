package in.nagendra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.nagendra.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = 
				       SpringApplication.run(Application.class, args);
		
		UserService us = ctxt.getBean(UserService.class);
		
		us.saveUser();
		
		us.saveUsers();
		
		
	}

}
