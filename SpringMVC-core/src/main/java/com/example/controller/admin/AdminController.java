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
	
	@GetMapping(value = "admin/role")
	public ModelAndView rolePage() {
		ModelAndView rolePage = new ModelAndView("admin/role");
		return rolePage;
	}
	
	@GetMapping(value = "admin/new")
	public ModelAndView newPage() {
		ModelAndView newPage = new ModelAndView("admin/new");
		return newPage;
	}
	
	@GetMapping(value = "admin/comment")
	public ModelAndView commentPage() {
		ModelAndView commentPage = new ModelAndView("admin/comment");
		return commentPage;
	}
	
	@GetMapping(value = "admin/category")
	public ModelAndView categoryPage() {
		ModelAndView categoryPage = new ModelAndView("admin/category");
		return categoryPage;
	}
}
