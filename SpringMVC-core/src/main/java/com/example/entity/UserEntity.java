package com.example.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class UserEntity extends BaseEntity {
	
	@Id
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String passWord;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="file_name")
	private String fileName;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userentity")
	private List<NewsEntity> news;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "users")
	private Set<RoleEntity> roles;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<CommentEntity> comment;

	public Set<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleEntity> roles) {
		this.roles = roles;
	}

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

	@Override
	public String toString() {
		return "UserEntity [userName=" + userName + ", passWord=" + passWord + ", fullName=" + fullName + ", address="
				+ address + ", email=" + email + ", phoneNumber=" + phoneNumber + ", fileName=" + fileName;
	}
}
	