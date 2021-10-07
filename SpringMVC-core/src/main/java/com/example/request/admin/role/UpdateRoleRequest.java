package com.example.request.admin.role;

import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.example.dto.UserDto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateRoleRequest {
	@NotBlank(message= "id không được rỗng")
	@Size(message = "Độ dài của id từ 4-20 ký tự")
	@JsonProperty("id")
	private String roleId;
	
	@NotBlank(message= "name không được rỗng")
	@Size(min = 4, max = 20, message = "Độ dài của name từ 4-20 ký tự")
	@JsonProperty("name")
	private String roleName;
	
	private Set<UserDto> users;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<UserDto> getUsers() {
		return users;
	}

	public void setUsers(Set<UserDto> users) {
		this.users = users;
	}
}
