package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.example.exception.BadRequestException;
import com.example.exception.InternalServerError;
import com.example.response.admin.CommonResponse;

@RestControllerAdvice
public class AdviceController {
	
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<CommonResponse> badRequest(BadRequestException exception) {
		CommonResponse response = new CommonResponse();
		response.setResultCode(exception.getCode());
		response.setResultMessage(exception.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<CommonResponse> notFound() {
		CommonResponse response = new CommonResponse();
		response.setResultCode("404");
		response.setResultMessage("URL not found");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
	
	@ExceptionHandler(InternalServerError.class) 
	public ResponseEntity<CommonResponse> internalServerError(InternalServerError exception) {
		CommonResponse response = new CommonResponse();
		response.setResultCode(exception.getCode());
		response.setResultMessage(exception.getMessage());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
	}
}
