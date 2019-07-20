package com.fdmgroup.GroupProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import com.fdmgroup.GroupProject.model.User;
import com.fdmgroup.GroupProject.repository.UserRepository;

@Component
public class UserDataImport implements ApplicationRunner {

	@Autowired
	UserRepository userRepo;

	@Autowired
	PasswordEncoder encoder;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		User tobi = new User();
		tobi.setEmail("abc");
		tobi.setPassword(encoder.encode("123"));
		tobi.setRole("admin");

		User fillUser = new User();
		fillUser.setEmail("fillUser");
		fillUser.setPassword(encoder.encode("123"));
		fillUser.setRole("user");

		User user1 = new User();
		user1.setEmail("hey");
		user1.setPassword(encoder.encode("123"));
		user1.setRole("user");

		User marcl = new User();
		marcl.setEmail("user");
		marcl.setPassword(encoder.encode("12"));
		marcl.setRole("user");
		
		userRepo.save(tobi);
		userRepo.save(fillUser);
		userRepo.save(marcl);
		userRepo.save(user1);
		
		User user2 = new User();
		user2.setEmail("user2");
		user2.setPassword(encoder.encode("123"));
		userRepo.save(user2);
		
		User user3 = new User();
		user3.setEmail("user3");
		user3.setPassword(encoder.encode("123"));
		userRepo.save(user3);
		
		User user4 = new User();
		user4.setEmail("user4");
		user4.setPassword(encoder.encode("123"));
		userRepo.save(user4);
		
		User user5 = new User();
		user5.setEmail("user5");
		user5.setPassword(encoder.encode("123"));
		userRepo.save(user5);
		
		User user6 = new User();
		user6.setEmail("user6");
		user6.setPassword(encoder.encode("123"));
		userRepo.save(user6);
		
		User user7 = new User();
		user7.setEmail("user7");
		user7.setPassword(encoder.encode("123"));
		userRepo.save(user7);
		
		User user8 = new User();
		user8.setEmail("user8");
		user8.setPassword(encoder.encode("123"));
		userRepo.save(user8);
		
		User user9 = new User();
		user9.setEmail("user9");
		user9.setPassword(encoder.encode("123"));
		userRepo.save(user9);

	}

}
