package com.example.controller.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class AdminController {
	@GetMapping(value = "admin")
	public ModelAndView adminPage() {
		ModelAndView adminPage = new ModelAndView("admin/home");
		return adminPage;
	}
	
	@GetMapping(value = "admin/user")
	public ModelAndView userPage() {
		ModelAndView adminPage = new ModelAndView("admin/user");
		return adminPage;
	}
}
