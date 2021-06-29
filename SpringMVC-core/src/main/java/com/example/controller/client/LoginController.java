package com.example.controller.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class LoginController {
	@GetMapping(value = "login")
	public ModelAndView loginPage() {
		ModelAndView loginPage = new ModelAndView("login/account");
		return loginPage;
	}
	
	
}
