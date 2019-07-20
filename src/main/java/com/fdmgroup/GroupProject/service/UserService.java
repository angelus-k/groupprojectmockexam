package com.fdmgroup.GroupProject.service;

import java.util.List;

import com.fdmgroup.GroupProject.model.User;

public interface UserService {

	List<User> findAllUser();

	void createNewUser(User user);

	void deleteUser(int id);

//	void updateOldUser(int id, String newUsername, String newPassword, String newEmail, List<Course> coursesList,
//			boolean newPremium, boolean newPersonaltrainer, boolean newSunny);
	
	void updateOldUser(User recentUser, User user);

	User showUser(int id);

//	List<User> findByName(String username);
	
	User findUserByEmail(String email);
	
//	User findUserByUsername(String username);

	String getRoleByName(String name);

//	void updateOldUserOnlyNameAndEmail(int id, String newEmail); //maybe for password reset

	boolean checkIfEmailExists(User user);

	void updateRole(User user, String role);

	User findUserById(int newId);

	boolean passwordCheck(String password, String password2);

	void changePassword(int id, String password);

}
