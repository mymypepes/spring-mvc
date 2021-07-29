package com.example.controller.admin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.admin.CreateUserRequest;
import com.example.request.admin.UpdateUserRequest;
import com.example.response.admin.CreateUserResponse;
import com.example.response.admin.UpdateUserResponse;
import com.example.service.UserService;

@RestController
public class AdminUserApi {
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/api/user/create", consumes = "application/json")
	public CreateUserResponse createUser(@RequestBody CreateUserRequest request) {
		CreateUserResponse response = userService.createUser(request);
		if(response.getResultCode().equals("00")) {
			response.setResultMess("thanh cong");
		}
		else {
			response.setResultMess("khong thanh cong");
		}
		return response;
	}
	@PutMapping(value = "/api/user/update", consumes = "application/json")
	public UpdateUserResponse updateUser(@RequestBody UpdateUserRequest request) {
		UpdateUserResponse response = userService.upadteUser(request);
		if(response.getResultCode().equals("00")) {
			response.setResultMess("thanh cong");
		}
		else {
			response.setResultMess("khong thanh cong");
		}
		return response;
	}
}
