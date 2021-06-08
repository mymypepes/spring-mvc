package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.UserEntity;
import com.example.repository.UserRepository;
import com.example.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserEntity findByUserName(String userName) {
		UserEntity result = userRepository.findOne(userName);
		return result;
	}

	@Override
	public List<UserEntity> findAll() {
		List<UserEntity> all = userRepository.findAll();
		return all;
	}

}
