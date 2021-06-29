package com.example.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.example.dto.CategoryDto;
import com.example.dto.UserDto;
import com.example.entity.CategoryEntity;
import com.example.entity.UserEntity;

@Component
public class CategoryConverter {
	@Autowired
	private ModelMapper modelMapper;
	
	public CategoryDto convertEntityToDto(CategoryEntity entity) {
		if (StringUtils.isEmpty(entity)) {
			return null;
		}
		CategoryDto categoryDto = modelMapper.map(entity, CategoryDto.class);
		return categoryDto;
	}
	
	public CategoryEntity convertDtoToEntity(CategoryDto dto) {
		CategoryEntity categoryEntity = modelMapper.map(dto, CategoryEntity.class);
		return categoryEntity;
	}
}
