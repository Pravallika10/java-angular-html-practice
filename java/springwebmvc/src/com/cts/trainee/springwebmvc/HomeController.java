package com.cts.trainee.springwebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		// add business logic
		
		// must always return view name
		return "home-page";
		
	}
	@RequestMapping("index")
	public String index() {
		// add business logic
		
		// must always return view name
		return "indexpage";
	}	

}
