package com.example.controller.client;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LoginController {
	@GetMapping(value = "login")
	public ModelAndView loginPage() {
		ModelAndView loginPage = new ModelAndView("login/login");
		return loginPage;
	}
	@GetMapping(value = "login/register")
	public ModelAndView registerPage() {
		ModelAndView registerPage = new ModelAndView("login/register");
		return registerPage;
	}
	
	@GetMapping(value = "/access-denied")
	public String accessDenied() {
		return "redirect:/login?accessDenied";
	}
	
	@GetMapping(value = "/logout")
	public String logoutPage(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login";
	}
}
