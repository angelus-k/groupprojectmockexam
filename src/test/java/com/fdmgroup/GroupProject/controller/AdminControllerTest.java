package com.fdmgroup.GroupProject.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import com.fdmgroup.GroupProject.model.User;
import com.fdmgroup.GroupProject.service.AnswerService;
import com.fdmgroup.GroupProject.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(AdminController.class)
@AutoConfigureMockMvc(secure = false)
public class AdminControllerTest {
	@Autowired
	MockMvc mockMvc;

	@MockBean
	UserService userService;

	@MockBean
	AnswerService answerService;
	User user;
	
	@Before
	public void setup(){
		user = new User();
		user.setEmail("abc");
		user.setPassword("123");
		user.setRole("user");
		
	}
	
	

	@Test
	public void viewAndShowUserListTest() throws Exception {
		List<User> users = Arrays.asList(new User());
		when(userService.findAllUser()).thenReturn(users);
		mockMvc.perform(get("/admin/userList")).andExpect(status().isOk()).andExpect(view().name("userList"))
				.andExpect(model().attribute("userList", users));
	}

	@Test
	@WithMockUser(roles = "admin")
	public void testIfUserUpdateToAdminWorks() throws Exception {
		
		String change = "admin";
		when(userService.checkIfEmailExists(userService.findUserByEmail(user.getEmail()))).thenReturn(true);

		
		mockMvc.perform(
				post("/admin/userList/update").param("model", "whatever").param("email", "abc").param("change", change))
				.andExpect(status().isOk()).andExpect(view().name("userList"));


	}

	@Test
	@WithMockUser(roles = "admin")
	public void testIfUserUpdateToUserWorks() throws Exception {
	
		String change = "admin";

		when(userService.checkIfEmailExists(userService.findUserByEmail(user.getEmail()))).thenReturn(true);
		// when(userService.updateRole(user,
		// change)).thenDo(user.setRole(change));
		mockMvc.perform(
				post("/admin/userList/update").param("model", "whatever").param("email", "abc").param("change", change))
				.andExpect(status().isOk()).andExpect(view().name("userList"));

		// verify(userService.updateRole(user, change));
		// verify(user).getRole().equals("admin");

	}

	@Test
	@WithMockUser(roles = "admin")
	public void testIfUserChangepasswordTo123() throws Exception {
	
		String change = "passwordTo123";

	
		mockMvc.perform(
				post("/admin/userList/update").param("model", "whatever").param("email", "abc").param("change", change))
				.andExpect(status().isOk()).andExpect(view().name("userList"));


	}



}
