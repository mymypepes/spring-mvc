package com.example.service;

import java.util.List;

import com.example.entity.UserEntity;
import com.example.request.admin.CreateUserRequest;
import com.example.request.admin.UpdateUserRequest;
import com.example.response.admin.CommonResponse;
import com.example.response.admin.CreateUserResponse;
import com.example.response.admin.DeleteUserResponse;
import com.example.response.admin.UpdateUserResponse;

public interface UserService {

	UserEntity findByUserName(String userName);
	
	List<UserEntity> findAll(); 
	
	public CommonResponse createUser(CreateUserRequest request);
	
	public CommonResponse upadteUser(UpdateUserRequest request);
	
	public CommonResponse deleteUser(String userName);
}
