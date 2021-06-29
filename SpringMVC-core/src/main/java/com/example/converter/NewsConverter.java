package com.example.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.example.dto.NewsDto;
import com.example.dto.RoleDto;
import com.example.entity.NewsEntity;
import com.example.entity.RoleEntity;

@Component
public class NewsConverter {
	@Autowired
	private ModelMapper modelMapper;
	public NewsDto convertEntityToDto(NewsEntity entity) {
		if(StringUtils.isEmpty(entity)) {
			return null;
		}
		NewsDto newsDto = modelMapper.map(entity, NewsDto.class);
		return newsDto;
	}
	public NewsEntity convertDtoToEntity(NewsDto dto) {
		NewsEntity newsEntity = modelMapper.map(dto, NewsEntity.class);
		return newsEntity;
	}
}
