package com.example.controller.admin.api;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.admin.user.CreateUserRequest;
import com.example.request.admin.user.UpdateUserRequest;
import com.example.response.admin.CommonResponse;
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
	public ResponseEntity<CommonResponse> deleteUser(@Valid @PathVariable("user-name") @NotBlank @Size(min = 4, max = 20, message = "Độ dài của user_name từ 4-20 ký tự") String userName) {
		CommonResponse response = userService.deleteUser(userName);
		return ResponseEntity.ok(response);
	}
}
