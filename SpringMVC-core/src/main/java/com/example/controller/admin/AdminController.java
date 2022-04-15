package com.example.controller.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class AdminController {
	@GetMapping(value = "admin")
	public ModelAndView adminPage() {
		ModelAndView adminPage = new ModelAndView("admin/home");
		return adminPage;
	}
	
	@GetMapping(value = "admin/user/list")
	public ModelAndView userPage() {
		ModelAndView adminPage = new ModelAndView("admin/user/list");
		return adminPage;
	}
	
	@GetMapping(value = "admin/user/add")
	public ModelAndView addUserPage() {
		ModelAndView adminPage = new ModelAndView("admin/user/add");
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
//		List<String> list = new ArrayList<>();
		ModelAndView categoryPage = new ModelAndView("admin/category");
		return categoryPage;
	}
}