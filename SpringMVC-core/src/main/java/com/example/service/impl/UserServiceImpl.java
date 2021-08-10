package com.example.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.common.ResultCode;
import com.example.converter.UserConverter;
import com.example.dto.UserDto;
import com.example.entity.UserEntity;
import com.example.repository.UserRepository;
import com.example.request.admin.CreateUserRequest;
import com.example.request.admin.DeleteUserRequest;
import com.example.request.admin.UpdateUserRequest;
import com.example.response.admin.CommonResponse;
import com.example.response.admin.CreateUserResponse;
import com.example.response.admin.DeleteUserResponse;
import com.example.response.admin.UpdateUserResponse;
import com.example.service.UserService;
@Service
@Transactional
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
	public CommonResponse createUser(CreateUserRequest request) {
		//Step 1: Query db 
		UserEntity userEntity = userRepository.findByUserName(request.getUserName());
		UserDto userDto = userConverter.convertEntityToDto(userEntity);
		
		CommonResponse response = new CommonResponse();
		//Step 2: Kiểm tra user đã đc tạo chưa (Nếu tồn tại username sẽ báo là username đã tồn tại)
		if(StringUtils.isEmpty(userDto)) {
			userDto.setUserName(request.getUserName());
			userDto.setPassWord(request.getPassWord());
			userDto.setFullName(request.getFullName());
			userDto.setAddress(request.getAddress());
			userDto.setEmail(request.getEmail());
			userDto.setPhoneNumber(request.getPhoneNumber());
			userDto.setFileName(request.getFileName());
		
			userEntity = userConverter.convertDtoToEntity(userDto);
			userRepository.save(userEntity);
			
			response.setResultCode(ResultCode._00.getCode());//trường hợp thành công
			response.setResultMessage(ResultCode._00.getValue());
			return response;
		}
		response.setResultCode(ResultCode._01.getCode()); // trường hợp bị sai
		response.setResultMessage(ResultCode._01.getValue());
		return response;
		//Step 3: Sau khi thỏa hết những step trên sẽ insert xuống db
		//Step 4: Trả ra kết quả
	}

	@Override
	public UpdateUserResponse upadteUser(UpdateUserRequest request) {
		//Step 1: Query db 
		// dag dung hibernate
		UserEntity userEntity = userRepository.findByUserName(request.getUserName());
		// khi query
		UserDto userDto = userConverter.convertEntityToDto(userEntity);
		UpdateUserResponse updateUserResponse = new UpdateUserResponse();
		//Step 2: Kiểm tra user không có
		
		if(userDto == null) {
			updateUserResponse.setResultCode("02");//trường hợp thành công
			updateUserResponse.setResultMess("khong tim thay");
			return updateUserResponse;
			
		}
		else {
			userDto.setUserName(request.getUserName());
			userDto.setPassWord(request.getPassWord());
			userDto.setFullName(request.getFullName());
			userDto.setAddress(request.getAddress());
			userDto.setEmail(request.getEmail());
			userDto.setPhoneNumber(request.getPhoneNumber());
			userDto.setFileName(request.getFileName());
			
			userEntity = userConverter.convertDtoToEntity(userDto);
			userRepository.save(userEntity);
			
			updateUserResponse.setResultCode("00"); // trường hợp bị sai
			updateUserResponse.setResultMess("update thanh cong");
			return updateUserResponse;
		}
			
		
	}

	@Override
	public DeleteUserResponse deleteUser(String userName) {
		UserEntity userEntity = userRepository.findByUserName(userName);
		UserDto userDto = userConverter.convertEntityToDto(userEntity);
		
		DeleteUserResponse deleteUserResponse = new DeleteUserResponse();
		if(StringUtils.isEmpty(userDto)){
			deleteUserResponse.setResultCode("03");
			deleteUserResponse.setResultMess("Khong tim thay user_name");
			return deleteUserResponse;
		}
		userEntity = userConverter.convertDtoToEntity(userDto);
		userRepository.delete(userEntity);
		deleteUserResponse.setResultCode("00");
		deleteUserResponse.setResultMess("Xoa thanh cong");
		return deleteUserResponse;
		
	}

}
