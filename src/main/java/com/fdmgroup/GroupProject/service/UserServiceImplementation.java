package com.fdmgroup.GroupProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.fdmgroup.GroupProject.model.User;
import com.fdmgroup.GroupProject.repository.UserRepository;

import oracle.net.ano.EncryptionService;

@Component
public class UserServiceImplementation implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	PasswordEncoder encoder;

	EncryptionService decoder;

	@Override
	public List<User> findAllUser() {

		List<User> users = userRepo.findAll();
		return users;
	}

	@Override
	public void createNewUser(User user) {
		//saves the (encoded) password 
		user.setPassword(encoder.encode(user.getPassword()));
		userRepo.save(user); // saves the place to database
	}

	@Override
	public void deleteUser(int id) {
		userRepo.deleteById(id);
	}

	@Override
	public void updateOldUser(User recentUser, User user) {

		User tempUser = recentUser;
				
		if (user.getPassword() != null && user.getNewPassword().isEmpty()) {
			//when new password null change to password
			tempUser.setPassword(encoder.encode(user.getPassword()));
		}
		if (user.getNewPassword() != null && !user.getNewPassword().isEmpty()) {
			//when new password not null change to new password
			tempUser.setPassword(encoder.encode(user.getNewPassword()));
		}
		if (user.getEmail() == null && user.getEmail().isEmpty()) {
			//when new email null change to old email
			tempUser.setEmail(recentUser.getEmail());
		} else if (user.getEmail() != null && !user.getEmail().isEmpty()) {
			//when new email not null change to new email
			tempUser.setEmail(user.getEmail());
		}

		userRepo.save(tempUser);
	}

	@Override
	public void changePassword(int id, String password) {
		Optional<User> newUser = userRepo.findById(id);
		if (newUser.isPresent()) {
			User user = newUser.get();
			user.setPassword(encoder.encode(password));
			userRepo.save(user);
		}
	}

	@Override
	public User showUser(int id) {
		User user = new User();

		Optional<User> newUser = userRepo.findById(id);
		if (newUser.isPresent()) {
			user = newUser.get();
		}
		return user;
	}


	@Override
	public User findUserByEmail(String email) {

		User user = userRepo.findUserByEmail(email);

		return user;
	}

	@Override
	public String getRoleByName(String name) {
		String role = userRepo.findUserByEmail(name).getRole();
		return role;
	}


	@Override
	public boolean checkIfEmailExists(User user) {

		boolean check = false;
		User checkUser = null;
		try {
			checkUser = userRepo.findUserByEmail(user.getEmail());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (checkUser != null) {
			check = true;
		}

		return check;
	}

	@Override
	public void updateRole(User user, String role) {
		user.setRole(role);
		userRepo.save(user);
	}

	@Override
	public User findUserById(int id) {
		return userRepo.findUserById(id);
	}

	@Override
	public boolean passwordCheck(String userPassword, String recentUserPassword) {
		System.out.println("recentPw" + recentUserPassword);
		System.out.println("userPw" + encoder.encode(userPassword));
		//checks if the givenPassword matches with the (encoded) DatabasePassword
		if (encoder.matches(userPassword, recentUserPassword)) {
			return true;
		}
		return false;
	}

}
