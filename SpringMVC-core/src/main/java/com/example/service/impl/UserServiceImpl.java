package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import com.example.converter.UserConverter;
import com.example.dto.UserDto;
import com.example.entity.UserEntity;
import com.example.repository.UserRepository;
import com.example.request.admin.CreateUserRequest;
import com.example.request.admin.UpdateUserRequest;
import com.example.response.admin.CreateUserResponse;
import com.example.response.admin.UpdateUserResponse;
import com.example.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserConverter userConverter;
	
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

	@Override
	public CreateUserResponse createUser(CreateUserRequest request) {
		//Step 1: Query db 
		UserEntity userEntity = userRepository.findByUserName(request.getUserName());
		CreateUserResponse createUserResponse = new CreateUserResponse();
		//Step 2: Kiểm tra user đã đc tạo chưa (Nếu tồn tại username sẽ báo là username đã tồn tại)
		if(userEntity == null) {
			UserDto userDto = new UserDto();
			userDto.setUserName(request.getUserName());
			userDto.setPassWord(request.getPassWord());
			userDto.setFullName(request.getFullName());
			userDto.setAddress(request.getAddress());
			userDto.setEmail(request.getEmail());
			userDto.setPhoneNumber(request.getPhoneNumber());
			userDto.setFileName(request.getFileName());
		
			userEntity = userConverter.convertDtoToEntity(userDto);
			userRepository.save(userEntity);
			
			createUserResponse.setResultCode("00");//trường hợp thành công
			createUserResponse.setResultMess("tao thanh cong");
			return createUserResponse;
		} else{
			createUserResponse.setResultCode("01"); // trường hợp bị sai
			createUserResponse.setResultMess("da ton tai");
			return createUserResponse;
		}
		//Step 3: Sau khi thỏa hết những step trên sẽ insert xuống db
		//Step 4: Trả ra kết quả
		
		
	}

	@Override
	public UpdateUserResponse upadteUser(UpdateUserRequest request) {
		//Step 1: Query db 
		UserEntity userEntity = userRepository.findByUserName(request.getUserName());
		UpdateUserResponse updateUserResponse = new UpdateUserResponse();
			return updateUserResponse;
		
	}
}
