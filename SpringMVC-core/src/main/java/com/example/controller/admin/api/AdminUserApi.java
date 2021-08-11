package com.example.controller.admin.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.MyUserDetail;
import com.example.exception.InternalServerError;
import com.example.request.admin.CreateUserRequest;
import com.example.request.admin.UpdateUserRequest;
import com.example.response.admin.CommonResponse;
import com.example.response.admin.DeleteUserResponse;
import com.example.response.admin.UpdateUserResponse;
import com.example.security.SecurityUtils;
import com.example.service.UserService;

@RestController
public class AdminUserApi {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/api/user/create", consumes = "application/json")
	public ResponseEntity<CommonResponse> createUser(@Valid @RequestBody CreateUserRequest request) {
		CommonResponse response = userService.createUser(request);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping(value = "/api/user/update", consumes = "application/json")
	public ResponseEntity<CommonResponse> updateUser(@Valid @RequestBody UpdateUserRequest request) {
		CommonResponse response = userService.upadteUser(request);
		return ResponseEntity.ok(response);
	}
	
	@DeleteMapping(value = "/api/user/delete/{user-name}")
	public ResponseEntity<CommonResponse> deleteUser(@PathVariable("user-name") String userName) {
		CommonResponse response = userService.deleteUser(userName);
		return ResponseEntity.ok(response);
	}
}
