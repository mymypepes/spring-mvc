package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.example.exception.BadRequestException;
import com.example.exception.InternalServerError;
import com.example.response.admin.CommonResponse;

@RestControllerAdvice
public class AdviceController {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> badRequest(MethodArgumentNotValidException exception) {
		BindingResult bindingResult = exception.getBindingResult();
		List<FieldError> listError = bindingResult.getFieldErrors();
		
		Map<String, String> mapError = new HashMap<>();
		for(FieldError fieldError : listError) {
			mapError.put("field_error", fieldError.getField());
			mapError.put("field_message", fieldError.getDefaultMessage());
		}
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mapError);
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<CommonResponse> notFound() {
		CommonResponse response = new CommonResponse();
		response.setResultCode("404");
		response.setResultMessage("URL not found");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
	
	@ExceptionHandler(InternalServerError.class) 
	public ResponseEntity<Map<String, String>> internalServerError(InternalServerError exception) {
		Map<String, String> mapError = new HashMap<>();
		mapError.put("field_error", exception.getCode());
		mapError.put("field_message", exception.getMessage());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mapError);
	}
}
