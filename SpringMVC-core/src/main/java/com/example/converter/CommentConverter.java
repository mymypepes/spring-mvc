package com.example.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.example.dto.CommentDto;
import com.example.dto.UserDto;
import com.example.entity.CommentEntity;
import com.example.entity.UserEntity;

@Component
public class CommentConverter {
	@Autowired
	private ModelMapper modelMapper;
	
	public CommentDto convertEntityToDto(CommentEntity entity) {
		if (StringUtils.isEmpty(entity)) {
			return null;
		}
		CommentDto commentDto = modelMapper.map(entity, CommentDto.class);
		return commentDto;
	}
	
	public CommentEntity convertDtoToEntity(CommentDto dto) {
		CommentEntity commentEntity = modelMapper.map(dto, CommentEntity.class);
		return commentEntity;
	}
}
