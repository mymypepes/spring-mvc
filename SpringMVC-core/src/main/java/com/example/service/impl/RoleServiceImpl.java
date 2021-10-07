package com.example.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.common.ResultCode;
import com.example.converter.RoleConverter;
import com.example.converter.UserConverter;
import com.example.dto.RoleDto;
import com.example.dto.UserDto;
import com.example.entity.RoleEntity;
import com.example.entity.UserEntity;
import com.example.exception.InternalServerError;
import com.example.repository.RoleRepository;
import com.example.repository.UserRepository;
import com.example.request.admin.role.CreateRoleRequest;
import com.example.request.admin.role.UpdateRoleRequest;
import com.example.request.admin.user.UpdateUserRequest;
import com.example.response.admin.CommonResponse;
import com.example.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private  RoleRepository roleRepository;
	
	@Autowired
	private RoleConverter roleConverter;
	
	@Override
	public RoleEntity findByUserName(String userName) {
		RoleEntity result = roleRepository.findOne(userName);
		return null;
	}

	@Override
	public List<RoleEntity> findAll() {
		List<RoleEntity> all = roleRepository.findAll();
		return null;
	}

	@Override
	public CommonResponse createRole(CreateRoleRequest request) {
		try {
			//Step 1: Query db findOne == findByUserName == findById
			RoleEntity roleEntity = roleRepository.findOne(request.getRoleName());
			RoleDto roleDto = roleConverter.convertEntityToDto(roleEntity);
			
			CommonResponse response = new CommonResponse();
			//Step 2: Kiểm tra user đã đc tạo chưa (Nếu tồn tại username sẽ báo là username đã tồn tại)
			if(StringUtils.isEmpty(roleDto)) {
				roleDto = RoleDto.createRole(request);
				
				roleEntity = roleConverter.convertDtoToEntity(roleDto);
				roleRepository.save(roleEntity);
				
				response.setResultCode(ResultCode._00.getCode());//trường hợp thành công
				response.setResultMessage(ResultCode._00.getValue());
				return response;
			}
			response.setResultCode(ResultCode._01.getCode()); // trường hợp bị sai
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
	public CommonResponse updateRole(UpdateRoleRequest request) {
		try {
			//Step 1: Query db 
			// dag dung hibernate
			RoleEntity roleEntity = roleRepository.findOne(request.getRoleName());
			// khi query
			RoleDto roleDto = roleConverter.convertEntityToDto(roleEntity);
			CommonResponse response = new CommonResponse();
			//Step 2: Kiểm tra user không có
			
			if(StringUtils.isEmpty(roleDto)) {
				response.setResultCode(ResultCode._02.getCode());
				response.setResultMessage(ResultCode._02.getValue());
				return response;
			} else {
				roleDto = RoleDto.updateRole(request);
				
				roleEntity = roleConverter.convertDtoToEntity(roleDto);
				roleRepository.save(roleEntity);
				
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
	public CommonResponse deleteRole(String roleName) {
		try {
			RoleEntity roleEntity = roleRepository.findOne(roleName);
			RoleDto roleDto = roleConverter.convertEntityToDto(roleEntity);
			
			CommonResponse response = new CommonResponse();
			if(StringUtils.isEmpty(roleDto)){
				response.setResultCode(ResultCode._02.getCode()); 
				response.setResultMessage(ResultCode._02.getValue());
				return response;
			}
			roleRepository.delete(roleName);// xao theo primary key
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
