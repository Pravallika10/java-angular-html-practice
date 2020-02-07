package com.cts.trainee.springwebmvc;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.cts.trainee.spring.web.model.Student;

/*   @Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/dashboard")
	public String home() {
		return "student-home";
	}
	
	@RequestMapping("/profile")
	public String profile() {
		Student student = new Student();
		student.setUname("Dummy");
		return "student-profile";
	}
	@RequestMapping("/save") // fallback method for bad url
	public String saveData(Student student,Model model) {
		System.out.println("\nName : " + student.getUname());
		System.out.println("Email : " + student.getEmail());
		student.setUname(student.getUname().toUpperCase());
		student.setEmail(student.getEmail().toUpperCase());
		model.addAttribute("stud",student);
		return "student-confirm";
	} */
	
	
	@Controller
	@RequestMapping("/student")
	public class StudentController {

		@RequestMapping("/dashboard")
		public String home() {
			return "student-home";
		}
		
		@RequestMapping("/profile")
		public String profile(Model model) 
		{
			Student student = new Student();
			//student.setUname("Dummy");
			model.addAttribute("student", student);
			return "student-profile";
		}
		
		@RequestMapping("/save")
		public String save(@ModelAttribute Student student) 
		{
			System.out.println("NAME : " + student.getUname());
			System.out.println("EMAIL : " + student.getEmail());
			return "student-confirm";
		}
		
		
	
	
	
	
	
	// mapping action method with parent url
	@RequestMapping() // default method for parent url
	public String defaultMethod() {
		return "student-home";
	}
	
	// Fallback url mapping (for bad urls)
	@RequestMapping("*") // fallback method for bad url
	public String fallbackMethod() {
		return "student-error";
	}
	
	
}