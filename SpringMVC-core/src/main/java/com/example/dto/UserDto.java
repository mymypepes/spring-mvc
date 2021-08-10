package com.example.dto;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.example.entity.UserEntity;
import com.example.request.admin.CreateUserRequest;
import com.example.security.SecurityUtils;

public class UserDto extends BaseDto{
	
	private String userName;
	
	private String passWord;
	
	private String fullName;
	
	private String address;
	
	private String email;
	
	private String phoneNumber;
	
	private String fileName;
	
	private List<NewsDto> news;
	
	private Set<RoleDto> roles;
	
	private List<CommentDto> comment;

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

	public List<NewsDto> getNews() {
		return news;
	}

	public void setNews(List<NewsDto> news) {
		this.news = news;
	}

	public Set<RoleDto> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleDto> roles) {
		this.roles = roles;
	}

	public List<CommentDto> getComment() {
		return comment;
	}

	public void setComment(List<CommentDto> comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "UserDto [userName=" + userName + ", passWord=" + passWord + ", fullName=" + fullName + ", address="
				+ address + ", email=" + email + ", phoneNumber=" + phoneNumber + ", fileName=" + fileName + ", news="
				+ news + ", roles=" + roles + ", comment=" + comment + "]";
	}
	public static UserDto createUser(CreateUserRequest request) {
		UserDto result = new UserDto();
		
		result.setUserName(request.getUserName());
		result.setPassWord(request.getPassWord());
		result.setFullName(request.getFullName());
		result.setAddress(request.getAddress());
		result.setEmail(request.getEmail());
		result.setPhoneNumber(request.getPhoneNumber());
		result.setFileName(request.getFileName());
		result.setCreateDate(new Date());

		result.setCreateBy("");
		return result;
	}
	
	
}
