package com.example.utils;

import org.springframework.stereotype.Component;

@Component
public class ValidationUtils {

	public boolean checkEmpty(String value) {
//		return value != null ? true : false;
		if(value == null || value.equals("") ) {
			return true;
		}
		return false;
	}
}
