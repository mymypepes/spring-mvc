package com.example.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.example.dto.UserDto;
import com.example.entity.UserEntity;
@Component
public class UserConverter {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public UserDto convertEntityToDto(UserEntity entity) {
		if (StringUtils.isEmpty(entity)) {
			return null;
		}
		UserDto userDto = modelMapper.map(entity, UserDto.class);
		return userDto;
	}
	
	public UserEntity convertDtoToEntity(UserDto dto) {
		UserEntity userEntity = modelMapper.map(dto, UserEntity.class);
		return userEntity;
	}
}
