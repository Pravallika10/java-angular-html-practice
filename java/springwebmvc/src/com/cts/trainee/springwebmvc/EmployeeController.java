package com.cts.trainee.springwebmvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@RequestMapping("/dashboard")
	public String home() {
		return "employee-home";
	}

}
