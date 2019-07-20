package com.fdmgroup.GroupProject.controller;

import java.util.Collection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.fdmgroup.GroupProject.model.User;
import com.fdmgroup.GroupProject.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService service;

	@GetMapping("/login")
	public String goToLogin(ModelMap model) {
		displayDefaultHiddenSuccess(model);
		return "login";
	}

	// logout:
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "login";
	}

	@GetMapping("/")
	public String goToWelcome(ModelMap model) {
		displayDefaultHiddenSuccess(model);
		displayDefaultHidden(model);
		String username = "hi";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			username = ((UserDetails) principal).getUsername();
		} else {
			username = principal.toString();
		}
		User user = service.findUserByEmail(username);
		String role = getRoleStringByAuth();

		if (role == "user") {

			// System.out.println("heeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeey
			// user");
			model.addAttribute("userToShow", user);

			return "userhome";
		}

		else if (role == "admin") {
			// System.out.println("heeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeey
			// admin");
			// List<User> users = service.findAllUser();
			// model.addAttribute("userList", users);
			return "adminhome";
		}

		else
			return "register";
	}

	@GetMapping("/register")
	public String registerGet(ModelMap model) {

		displayDefaultHidden(model);

		return "register";
	}

	@PostMapping("/register")
	public String registerNew(@ModelAttribute User user, ModelMap model) {

		displayDefaultHidden(model);
		if (service.checkIfEmailExists(user)) {
			model.addAttribute("emailExists", user.getEmail());
			displayErrorMessage(model);
			return "register";
		} else {
			model.addAttribute("email", user.getEmail());
			displaySuccessMessage(model);
			displayDefaultHidden(model);
			service.createNewUser(user); // method in service
			return "login";
		}

	}

	private String getRoleStringByAuth() {

		String returnString = "no";

		@SuppressWarnings("unchecked")
		Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>) SecurityContextHolder
				.getContext().getAuthentication().getAuthorities();

		for (SimpleGrantedAuthority simple : authorities) {

			if (simple.getAuthority().equals("ROLE_admin")) {
				returnString = "admin";
			}
			if (simple.getAuthority().equals("ROLE_user")) {
				returnString = "user";
			}
		}
		return returnString;
	}

	@PostMapping("/admin/users")
	public String addUser(@ModelAttribute User user, ModelMap model) {
		displayDefaultHidden(model);
		if (service.checkIfEmailExists(user)) {
			model.addAttribute("emailExists", user.getEmail());
			displayErrorMessage(model);
		} else {
			displayDefaultHidden(model);
			service.createNewUser(user); // method in service
		}
		List<User> users = service.findAllUser();
		model.addAttribute("userList", users);
		// gives data to jsp as placeList
		return "welcome";

	}

	private void displayDefaultHidden(ModelMap model) {
		model.addAttribute("display", "display:none; color: red;");
	}

	private void displayErrorMessage(ModelMap model) {
		model.addAttribute("display", "display:initial; color: red;");
	}

	private void displayDefaultHiddenSuccess(ModelMap model) {
		model.addAttribute("displaySuccess", "display:none;");
	}

	private void displaySuccessMessage(ModelMap model) {
		model.addAttribute("displaySuccess", "display:initial; color: green;");
	}

	@PostMapping("/admin/showUser/")
	public String showUser(int id, ModelMap model) {
		User user = service.showUser(id);
		model.addAttribute("userToShow", user);
		return "showUser";
	}

	@GetMapping("/admin/users/remove/{id}")
	public String deleteUserInUsers(@PathVariable int id, ModelMap model) {
		// removes per id from the for loop from list

		displayDefaultHidden(model);
		service.deleteUser(id);
		populateUsers(model);

		return "users";
	}

	@GetMapping("/admin/showUser/{id}")
	public String showUserId(@PathVariable int id, ModelMap model) {
		// shows user profile
		User user = service.showUser(id);

		model.addAttribute("userToShow", user);

		return "showUser";
	}

	private void populateUsers(ModelMap model) {

		List<User> users = service.findAllUser();
		model.addAttribute("userList", users);

	}

}
