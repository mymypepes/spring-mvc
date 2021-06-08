package com.example.service;

import java.util.List;

import com.example.entity.UserEntity;

public interface UserService {

	UserEntity findByUserName(String userName);
	
	List<UserEntity> findAll();
}
