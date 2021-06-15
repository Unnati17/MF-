package com.ncu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncu.Model.ExamDetails;
import com.ncu.Model.Question;
import com.ncu.Model.UserLogin;

@Controller
public class MainController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}


	@RequestMapping("/register")
	public String userRegistration(Model model) {
		model.addAttribute("UserModel", new UserLogin());
		return "register";
	}
	@RequestMapping("/login")
	public String userLogin(Model model) {
		model.addAttribute("UserModel", new UserLogin());
		return "login";
	}
	@RequestMapping("/loginFaculty")
	public String facultyLogin(Model fl) {
		fl.addAttribute("UserModel", new UserLogin());
		return "loginFaculty";
	}
	@RequestMapping("/loginStudent")
	public String studentLogin(Model sl) {
		sl.addAttribute("UserModel", new UserLogin());
		return "loginStudent";
	}
	/*
	 * @RequestMapping("/login") public String userLogin(Model model) {
	 * model.addAttribute("UserModel", new UserLogin()); return "login"; }
	 */

	@RequestMapping("/smanage")
	public String studentManage() {
		return "student_manage";
	}
	 
		@RequestMapping("/student")
		public String student() {
			return "student";
		}


	 
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}



	@RequestMapping("/faculty")
	public String faculty() {
		return "faculty";
	}
	@RequestMapping("/addStudent")
	public String addStudent(Model model1) {
		model1.addAttribute("UserModel", new UserLogin());
	
		return "add_student";
	}
	@RequestMapping("/addFaculty")
	public String addFaculty(Model model2) {
		model2.addAttribute("UserModel", new UserLogin());
	
		return "add_faculty";
	}
	
	  @RequestMapping("/fmanage") 
	  public String facultyManage() {
		  return "faculty_manage"; 
	 }
	  
	  @RequestMapping("/examDetails") 
	  public String examDetails(Model model) {
		  model.addAttribute("ExamModel", new ExamDetails());
		  return "examDetails"; 
	 }
	  @RequestMapping("/examlist") 
	  public String examList() {
		  return "examlist"; 
	 }
	  @RequestMapping("/viewExam") 
	  public String viewExam() {
		  return "viewExam"; 
	 }
	  @RequestMapping("/newQues") 
	  public String newQues(Model m) {
		  m.addAttribute("QuesModel", new Question());
	  
		  return "newQues"; 
	 }
	
	  
	/*
	 * @RequestMapping("/Fmanage") public String facultyManage(@ModelAttribute
	 * ("UserModel") UserLogin user, Model model ) { model.addAttribute("Name",
	 * user.getUsername()); model.addAttribute("Email", user.getEmail());
	 * model.addAttribute("Password", user.getPassword());
	 * model.addAttribute("Date of Birth", user.getDob());
	 * 
	 * 
	 * return "faculty_manage"; }
	 */

}