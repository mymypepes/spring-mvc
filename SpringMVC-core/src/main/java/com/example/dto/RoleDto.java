package com.example.dto;

import java.util.Date;
import java.util.Set;

import com.example.request.admin.role.CreateRoleRequest;
import com.example.request.admin.role.UpdateRoleRequest;

public class RoleDto extends BaseDto{
	private String roleId;
	
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

	@Override
	public String toString() {
		return "RoleDto [roleId=" + roleId + ", roleName=" + roleName + ", users=" + users + "]";
	}
	
	public static RoleDto createRole(CreateRoleRequest request) {
		RoleDto result = new RoleDto();
		
		result.setRoleId(request.getRoleId());
		result.setRoleName(request.getRoleName());
		result.setCreateDate(new Date());

		result.setCreateBy("");
		return result;
	}
	
	public static RoleDto updateRole(UpdateRoleRequest request) {
		RoleDto result = new RoleDto();
		
		result.setRoleId(request.getRoleId());
		result.setRoleName(request.getRoleName());
		result.setUpdateDate(new Date());

		result.setUpdateBy("");
		return result;
	}
}
