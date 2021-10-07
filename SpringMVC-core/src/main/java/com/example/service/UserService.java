package com.example.service;

import java.util.List;

import com.example.entity.UserEntity;
import com.example.request.admin.user.CreateUserRequest;
import com.example.request.admin.user.UpdateUserRequest;
import com.example.response.admin.CommonResponse;

public interface UserService {

	UserEntity findByUserName(String userName);
	
	List<UserEntity> findAll(); 
	
	public CommonResponse createUser(CreateUserRequest request);
	
	public CommonResponse upadteUser(UpdateUserRequest request);
	
	public CommonResponse deleteUser(String userName);
}
