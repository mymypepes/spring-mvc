package com.example.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.example.dto.RoleDto;
import com.example.dto.UserDto;
import com.example.entity.RoleEntity;
import com.example.entity.UserEntity;

@Component
public class RoleConverter {
	@Autowired
	private ModelMapper modelMapper;
	
	public RoleDto convertEntityToDto(RoleEntity entity) {
		if (StringUtils.isEmpty(entity)) {
			return null;
		}
		RoleDto roleDto = modelMapper.map(entity, RoleDto.class);
		return roleDto;
	}
	
	public RoleEntity convertDtoToEntity(RoleDto dto) { 
		RoleEntity roleEntity = modelMapper.map(dto, RoleEntity.class);
		return roleEntity;
	}
}
