package com.example.request.admin;

import org.springframework.data.web.JsonPath;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

import com.example.exception.BadRequestException;
import com.example.response.admin.CommonResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateUserRequest {
	
	@JsonProperty("user_name")
	private String userName;
	@JsonProperty("password")
	private String passWord;
	@JsonProperty("full_name")
	private String fullName;
	@JsonProperty("address")
	private String address;
	@JsonProperty("email")
	private String email;
	@JsonProperty("phone_number")
	private String phoneNumber;
	@JsonProperty("file_name")
	private String fileName;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void validated() {
		if (StringUtils.isEmpty(this.userName)) {
			throw new BadRequestException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "user_name không được rỗng");
		}//tuong tu bat cho toàn bo field còn lại
	}
}
