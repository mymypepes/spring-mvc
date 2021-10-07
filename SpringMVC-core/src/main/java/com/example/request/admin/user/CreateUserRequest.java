package com.example.request.admin.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

import com.example.exception.BadRequestException;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateUserRequest {
	//không đc rỗng không đc null
	@NotBlank(message= "user_name không được rỗng")
	@Size(min = 4, max = 20, message = "Độ dài của user_name từ 4-20 ký tự")
	@JsonProperty("user_name")
	private String userName;
	
	@NotBlank(message= "password không được rỗng")
	@Size(min = 8, max = 20, message = "Độ dài của password từ 8-20 ký tự")
	@JsonProperty("password")
	private String passWord;
	
	@NotBlank(message= "full_name không được rỗng")
	@Size(max = 50, message = "Độ dài của full_name là 50 ký tự")
	@JsonProperty("full_name")
	private String fullName;
	
	@NotBlank(message= "address không được rỗng")
	@Size(max = 1000, message = "Độ dài của address là 100 ký tự")
	@JsonProperty("address")
	private String address;
	
	@NotBlank(message= "email không được rỗng")
	@Size(max = 1000, message = "Độ dài của email là 100 ký tự")
	@JsonProperty("email")
	private String email;
	
	@NotBlank(message= "phone_number không được rỗng")
	@Size(min = 10 ,max = 10, message = "Độ dài của phone_number là 10 ký tự")
	@JsonProperty("phone_number")
	private String phoneNumber;
	
	@NotBlank(message= "file_name không được rỗng")
	@Size(max = 100, message = "Độ dài của file_name là 100 ký tự")
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
		}else if(this.userName.length() > 50) {
			throw new BadRequestException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Độ dài tối đa của user_name là 50 ký tự");
		}else if(this.passWord.length() > 10) {
			throw new BadRequestException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Độ dài tối đa của password là 10 ký tự");
		}else if(StringUtils.isEmpty(this.passWord)) {
			throw new BadRequestException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "password không được rỗng");
		}else if(StringUtils.isEmpty(this.fullName)) {
			throw new BadRequestException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "full_name không được rỗng");
		}else if(StringUtils.isEmpty(this.fullName)) {
			throw new BadRequestException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "full_name không được rỗng");
		}else if(StringUtils.isEmpty(this.address)) {
			throw new BadRequestException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "address không được rỗng");
		}else if(StringUtils.isEmpty(this.address)) {
			throw new BadRequestException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "address không được rỗng");
		}else if(StringUtils.isEmpty(this.email)) {
			throw new BadRequestException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "email không được rỗng");
		}else if(StringUtils.isEmpty(this.phoneNumber)) {
			throw new BadRequestException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "phone_number không được rỗng");
		}else if(StringUtils.isEmpty(this.fileName)) {
			throw new BadRequestException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "file_name không được rỗng");
		}
	}
}
