//package com.example.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.example.service.HomeService;
//import com.example.utils.ValidationUtils;
//
////@Controller
//@RestController
//public class HomeController {
//	
//	@Autowired
//	private HomeService homeServiceImpl;
//	
//	@Autowired
//	private ValidationUtils validationUtils;
//	
//	//GET, POST, PUT, DELETE, PATCH
////	@RequestMapping(method = RequestMethod.GET, value = "web")
//	//@RequestParam("user_name") String userName
//	@GetMapping(value = "web")
//	public ModelAndView homePage(@RequestParam("user_name") String userName) {
//		ModelAndView mav = new ModelAndView("web/home");
//		
//		//check validation for request param
//		if (validationUtils.checkEmpty(userName)) {
//			mav.addObject("login", "username is missing.");
//			return mav;
//		}
//		
//		if (homeServiceImpl.login(userName)) {
//			mav.addObject("login", "login thÃ nh cÃ´ng");
//		} else {
//			mav.addObject("login", "login khÃ´ng thÃ nh cÃ´ng");
//		}
//		
//		//Tenary operation hoáº·c gá»�i lÃ  toÃ¡n tá»­ 3 ngÃ´i
////		mav.addObject("login", userName.equals("mynho") ? "login thÃ nh cÃ´ng" : "login khÃ´ng thÃ nh cÃ´ng");
//		
////		if(userName.equals("mynho")) {
////			mav.addObject("login", "login thÃ nh cÃ´ng");
////		}
////		else {
////			mav.addObject("login", "login khÃ´ng thÃ nh cÃ´ng");
////		}
//		return mav;
//	}
//	
//	@GetMapping(value = "mymy/{id}")
//	public ModelAndView myMyInformation (@PathVariable("id") String id) {
//		ModelAndView mymy = new ModelAndView("web/mymy");
//		mymy.addObject("key", id);
//		return mymy;
//	}
//	
//}
