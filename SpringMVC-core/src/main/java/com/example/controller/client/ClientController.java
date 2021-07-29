package com.example.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ClientController {
	@GetMapping(value = "/")
	public ModelAndView clientPage() {
		ModelAndView clientPage = new ModelAndView("client/home");
		return clientPage;
	}
		
}
