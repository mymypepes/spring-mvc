package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.UserEntity;
import com.example.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "web-tin-tuc")
	public ModelAndView user (@RequestParam("user_name") String userName) {
		UserEntity result = userService.findByUserName(userName);
//		List<UserEntity> lisst = userService.findAll();
//		String result = "";
//		for(UserEntity entity : lisst) {
//			result += entity.toString();
//		}
		ModelAndView mav = new ModelAndView("web/user");
		mav.addObject("user", result);
		return mav;
	}
}
