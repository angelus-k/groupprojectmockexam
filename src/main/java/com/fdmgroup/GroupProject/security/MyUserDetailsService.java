package com.fdmgroup.GroupProject.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.fdmgroup.GroupProject.model.User;
import com.fdmgroup.GroupProject.repository.UserRepository;

@Component
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findUserByEmail(username);
		if (user == null)
			throw new UsernameNotFoundException("User not found");
		return new MyUserPrincipal(user);
	}
	
	public String getRoleByName(String name) {
		String role = userRepo.findUserByEmail(name).getRole();
		return role;
	}
	
	
	
	

}
