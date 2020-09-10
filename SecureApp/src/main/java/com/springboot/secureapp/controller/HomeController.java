package com.springboot.secureapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * Use @Controller with @GetMapping
 * Use @RestController with @RequestMapping
 * */
@Controller
public class HomeController {

	@GetMapping("/")
	public String getString() {
		return "home.jsp";
	}
}
