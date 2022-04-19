package com.example.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.common.ResultCode;
import com.example.converter.UserConverter;
import com.example.dto.UserDto;
import com.example.entity.UserEntity;
import com.example.exception.InternalServerError;
import com.example.repository.UserRepository;
import com.example.request.admin.user.CreateUserRequest;
import com.example.request.admin.user.UpdateUserRequest;
import com.example.response.admin.CommonResponse;
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
		try {
			//Step 1: Query db findOne == findByUserName == findById
			UserEntity userEntity = userRepository.findOne(request.getUserName());
			UserDto userDto = userConverter.convertEntityToDto(userEntity);// lý do dùng DTO là: mún các service không nói chuyện trực tiếp với ENTITY mà pải thông qua DTO. Đẻ đảm bảo tính an toàn dữ liệu cho db
			
			CommonResponse response = new CommonResponse();
			//Step 2: Kiểm tra user đã đc tạo chưa (Nếu tồn tại username sẽ báo là username đã tồn tại)
			if(StringUtils.isEmpty(userDto)) {
				userDto = UserDto.createUser(request);
				
				userEntity = userConverter.convertDtoToEntity(userDto);
				userRepository.save(userEntity);
				
				response.setResultCode(ResultCode._00.getCode());//trường hợp tạo thành công user
				response.setResultMessage(ResultCode._00.getValue());
				return response;
			}
			response.setResultCode(ResultCode._01.getCode()); // trường hợp đã tồn tại user
			response.setResultMessage(ResultCode._01.getValue());
			return response;
			//Step 3: Sau khi thỏa hết những step trên sẽ insert xuống db
			//Step 4: Trả ra kết quả
		} catch (Exception e) {
			System.out.println("lỗi rồi bạn ơi " + e.toString());
			throw new InternalServerError(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value())
					, HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
		}
	}

	@Override
	public CommonResponse upadteUser(UpdateUserRequest request) {
		try {
			//Step 1: Query db 
			// dag dung hibernate
			UserEntity userEntity = userRepository.findOne(request.getUserName());
			// khi query
			UserDto userDto = userConverter.convertEntityToDto(userEntity);
			CommonResponse response = new CommonResponse();
			//Step 2: Kiểm tra user không có
			
			if(StringUtils.isEmpty(userDto)) {
				response.setResultCode(ResultCode._02.getCode());
				response.setResultMessage(ResultCode._02.getValue());
				return response;
			} else {
				userDto = UserDto.updateUser(request);
				
				userEntity = userConverter.convertDtoToEntity(userDto);
				userRepository.save(userEntity);
				
				response.setResultCode(ResultCode._00.getCode());
				response.setResultMessage(ResultCode._00.getValue());
				return response;
			}
		} catch (Exception e) {
			System.out.println("lỗi rồi bạn ơi " + e.toString());
			throw new InternalServerError(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value())
					, HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
		}
	}

	@Override
	public CommonResponse deleteUser(String userName) {
		try {
			UserEntity userEntity = userRepository.findOne(userName);
			UserDto userDto = userConverter.convertEntityToDto(userEntity);
			
			CommonResponse response = new CommonResponse();
			if(StringUtils.isEmpty(userDto)){
				response.setResultCode(ResultCode._02.getCode()); 
				response.setResultMessage(ResultCode._02.getValue());
				return response;
			}
			userRepository.delete(userName);// xao theo primary key
			/*userRepository.delete(userEntity);*/ // xoa theo doi tuong
			response.setResultCode(ResultCode._00.getCode());
			response.setResultMessage(ResultCode._00.getValue());
			return response;
			
		} catch (Exception e) {
			System.out.println("lỗi rồi bạn ơi " + e.toString());
			throw new InternalServerError(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value())
					, HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
		}
		
	}

}
