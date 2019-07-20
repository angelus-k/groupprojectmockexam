package com.fdmgroup.GroupProject.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fdmgroup.GroupProject.model.Exam;
import com.fdmgroup.GroupProject.model.ReportQuestion;
import com.fdmgroup.GroupProject.model.User;
import com.fdmgroup.GroupProject.service.AnswerService;
import com.fdmgroup.GroupProject.service.ExamService;
import com.fdmgroup.GroupProject.service.QuestionService;
import com.fdmgroup.GroupProject.service.UserService;

@Controller
public class AdminController {

	@Autowired
	UserService userService;
	@Autowired
	AnswerService answerService;
	@Autowired
	ExamService examService;
	
	@Autowired
	QuestionService questionService;



	@GetMapping("/admin/userList")
	public String viewUsers(@ModelAttribute User user, ModelMap model) {
		displayDefaultHidden(model);
		List<User> users = userService.findAllUser();
		model.addAttribute("userList", users);
		return "userList";

	}

	@PostMapping("/admin/userList")
	public String showUserList(@ModelAttribute User user, ModelMap model, @RequestParam String id) {
		displayDefaultHidden(model);
		List<User> users = userService.findAllUser();
		model.addAttribute("userList", users);
		return "userList";
	}
	
	@PostMapping("/admin/questionReportsDelete/{rId}")
	public String showReportListDelete(ModelMap model, @PathVariable int rId) {
		
		questionService.deleteReport(rId);
		List<ReportQuestion> reportlist = questionService.findAllReports();
		model.addAttribute("reportlist", reportlist);
		return "questionReports";
	}
	
	@PostMapping("/admin/questionReports")
	public String showReportList(ModelMap model) {
		List<ReportQuestion> reportlist = questionService.findAllReports();
		model.addAttribute("reportlist", reportlist);
		return "questionReports";
	}

	@PostMapping("/admin/userList/update")
	public String updateUser(@RequestParam String email, @RequestParam String change, ModelMap model) {
		displayDefaultHidden(model);

		if (userService.checkIfEmailExists(userService.findUserByEmail(email))) {
			// when user is found by email do
			User user = userService.findUserByEmail(email);
			displayDefaultHidden(model);
			if (change.equals("admin") || change.equals("user")) {
				// change role to either admin or user
				userService.updateRole(user, change);
			}
			if (change.equals("passwordTo123")) {
				// change password to 123
				userService.changePassword(user.getId(), "123");
			}
			if (change.equals("showProfile")) {
				// go to user profile
				displayDefaultHidden(model);
				model.addAttribute("displayPasswordFalse", "display:none; color: red;");
				model.addAttribute("userToShow", user);

				return "userProfile";

			}
			if (change.equals("delete")) {
				// deletes the user
				
				List<Exam> allExams = examService.getAllExams();
				for(Exam exam: allExams)	
				{
					if(exam.getUser().getId()==user.getId()){
						exam.setUser(null);
					}
				}
				userService.deleteUser(user.getId());
			}

		} else {
			// when email not found display errorMessage and given email
			displayErrorMessage(model);
			model.addAttribute("emailExists", email);
		}
		// always return the list of users
		List<User> users = userService.findAllUser();
		model.addAttribute("userList", users);
		return "userList";
	}

	@PostMapping("/admin/userList/update/{id}")
	public String updateGivenID(@RequestParam String password, @PathVariable int id, ModelMap model) {
		displayDefaultHidden(model);
		// update password by Id
		userService.changePassword(id, password);
		List<User> users = userService.findAllUser();
		model.addAttribute("userList", users);
		return "userList";
	}

	@GetMapping("/userProfile/{id}")
	public String showUserId(@PathVariable String id, ModelMap model) {
		int newId = Integer.parseInt(id);
		displayDefaultHidden(model);
		model.addAttribute("displayPasswordFalse", "display:none; color: red;");
		User user = userService.showUser(newId);
		model.addAttribute("userToShow", user);

		return "userProfile";
	}

	@PostMapping("/userProfile/{id}")
	public String showUserIdUpdate(@PathVariable String id, ModelMap model) {
		int newId = Integer.parseInt(id);

		displayDefaultHidden(model);
		model.addAttribute("displayPasswordFalse", "display:none; color: red;");
		User user = userService.showUser(newId);
		model.addAttribute("userToShow", user);

		return "userProfile";
	}

	@PostMapping("/userProfile/update/{id}")
	public String updateUserLogged(@ModelAttribute User user, ModelMap model, @RequestParam String id) {

		int newId = Integer.parseInt(id);
		displayDefaultHidden(model);
		User recentUser = userService.findUserById(newId);
		model.addAttribute("displayPasswordFalse", "display:none; color: red;");
		if (user.getPassword() != null && userService.passwordCheck(user.getPassword(), recentUser.getPassword())) {
			// if the password is correct do
			if (user.getEmail() != null && userService.checkIfEmailExists(user)) {
				// if the email not null but exist already
				model.addAttribute("emailExists", user.getEmail());
				displayErrorMessage(model);
			} else if (user.getEmail() != null && userService.checkIfEmailExists(user) == false) {
				// when email not null and email name is available
				displayDefaultHidden(model);
				// change with new email
				userService.updateOldUser(recentUser, user);
			} else {
				// when mail is null still update everything else
				displayDefaultHidden(model);
				userService.updateOldUser(recentUser, user);
			}
		}

		else {
			// when password isnt true show error message
			model.addAttribute("displayPasswordFalse", "display:inital; color: red;");
		}
		User userToShow = userService.findUserById(newId);
		model.addAttribute("userToShow", userToShow);
		return "userProfile";
	}

	private void displayDefaultHidden(ModelMap model) {
		model.addAttribute("display", "display:none; color: red;");
	}

	private void displayErrorMessage(ModelMap model) {
		model.addAttribute("display", "display:initial; color: red;");
	}

	@GetMapping("/updateExam")
	public String updateExam() {

		return "adminhome";
	}

	@GetMapping("/viewReports")
	public String viewReports() {

		return "adminhome";

	}

	
}
