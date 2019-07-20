package com.fdmgroup.GroupProject.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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
import com.fdmgroup.GroupProject.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(LoginController.class)
@AutoConfigureMockMvc(secure = false)
public class LoginControllerTest {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	private UserService service;

	// User mockUser;
	//
	// @Before
	// public void setup() {
	//
	// mockUser=mock(User.class);
	// mockUser.setEmail("abc");
	// mockUser.setPassword("123");
	// mockUser.setRole("admin");
	// }

	@Test
	public void testIfgotToLoginStatusIsOkandGivesCorrectView() throws Exception {
		mockMvc.perform(get("/login")).andExpect(status().isOk()).andExpect(view().name("login"));
	}

	@Test
	public void testIfLogoutStatusIsOkandgivesCorrectView() throws Exception {
		mockMvc.perform(get("/logout")).andExpect(status().isOk()).andExpect(view().name("login"));
	}

	@Test
	public void testIfdeleteUserInUsersWorks() throws Exception {

		List<User> users = Arrays.asList(new User());
		when(service.findAllUser()).thenReturn(users);
		mockMvc.perform(get("/admin/users/remove/14")).andExpect(status().isOk()).andExpect(view().name("users"))
				.andExpect(model().attribute("display", "display:none; color: red;"))
				.andExpect(model().attribute("userList", users));

		verify(service).deleteUser(14);

	}

	@Test
	public void testIfshowUserIdWorks() throws Exception {

		User user = new User();
		when(service.showUser(14)).thenReturn(user);

		mockMvc.perform(get("/admin/showUser/14")).andExpect(status().isOk()).andExpect(view().name("showUser"))
				.andExpect(model().attribute("userToShow", user));

		verify(service).showUser(14);
	}

	@Test
	public void testIfshowUserWorks() throws Exception {
		User user = new User();
		when(service.showUser(14)).thenReturn(user);
		mockMvc.perform(post("/admin/showUser/").param("id", "14")).andExpect(status().isOk());

	}

	@Test
	public void testIfRegisterNewWorks_ifUserDoesntExist() throws Exception {
		User user = new User();
		user.setPassword("123");
		user.setEmail("words");
		mockMvc.perform(post("/register").param("password", "123").param("email", "words")).andExpect(status().isOk())
				.andExpect(model().attribute("display", "display:none; color: red;"));
		verify(service).createNewUser(user);

	}

	@Test
	public void testIfRegisterNewWorks_ifUserDoesExist() throws Exception {

		User user = new User();
		user.setPassword("123");
		user.setEmail("abc");

		when(service.checkIfEmailExists(user)).thenReturn(true);
		mockMvc.perform(post("/register").param("password", "123").param("email", "abc")).andExpect(status().isOk())
				.andExpect(model().attribute("display", "display:initial; color: red;"))
				.andExpect(model().attribute("emailExists", "abc"));

	}

	@Test
	public void testIfAddUserNewWorks_ifUserDoesntExist() throws Exception {
		User user = new User();
		user.setPassword("123");
		user.setEmail("words");
		mockMvc.perform(post("/admin/users").param("password", "123").param("email", "words"))
				.andExpect(status().isOk()).andExpect(model().attribute("display", "display:none; color: red;"));
		verify(service).createNewUser(user);

	}

	@Test
	public void testIfAddUserNewWorks_ifUserDoesExist() throws Exception {

		User user = new User();
		user.setPassword("123");
		user.setEmail("abc");

		when(service.checkIfEmailExists(user)).thenReturn(true);
		mockMvc.perform(post("/admin/users").param("password", "123").param("email", "abc")).andExpect(status().isOk())
				.andExpect(model().attribute("display", "display:initial; color: red;"))
				.andExpect(model().attribute("emailExists", "abc"));

	}

	@Test
	@WithMockUser(roles = "admin")
	public void testIfgoToWelcome_Admin() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("adminhome"));

	}

	@Test
	@WithMockUser(roles = "user")
	public void testIfgoToWelcome_User() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("userhome"));

	}

	@Test
	@WithMockUser
	public void testIfgoToWelcome_Anybody() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("register"));

	}

	@Test
	public void testIfregisterget() throws Exception {
		mockMvc.perform(get("/register")).andExpect(status().isOk()).andExpect(view().name("register"));

	}

}
