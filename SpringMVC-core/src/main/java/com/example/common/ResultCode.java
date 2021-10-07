package com.example.common;

public enum ResultCode {
	_00("00", "Sucess"),
	_01("01", "User name đã tồn tại"),
	_02("02", "Không tìm thấy user name"),
	_03("03", "Role da ton tai")
	;
	
	private String code;
	
	private String value;

	public String getCode() {
		return code;
	}

	public String getValue() {
		return value;
	}
	
	private ResultCode(String code, String value) {
		this.code = code;
		this.value = value;
	}
}
