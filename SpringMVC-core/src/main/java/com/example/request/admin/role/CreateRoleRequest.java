package com.example.request.admin.role;

import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

import com.example.dto.UserDto;
import com.example.exception.BadRequestException;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateRoleRequest {
	@NotBlank(message= "id không được rỗng")
	@Size(message = "Độ dài của id từ 4-20 ký tự")
	@JsonProperty("role_id")
	private String roleId;
	
	@NotBlank(message= "name không được rỗng")
	@Size(min = 4, max = 20, message = "Độ dài của name từ 4-20 ký tự")
	@JsonProperty("role_name")
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
	
	public void validated() {
		if (StringUtils.isEmpty(this.roleId)) {
			throw new BadRequestException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "role_Id không được rỗng");
		}else if(this.roleId.length() > 50) {
			throw new BadRequestException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Độ dài tối đa của role_Id là 50 ký tự");
		}else if(this.roleName.length() > 10) {
			throw new BadRequestException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Độ dài tối đa của role_Name là 10 ký tự");
		}else if(StringUtils.isEmpty(this.roleName)) {
			throw new BadRequestException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "role_Name không được rỗng");
		}
	}
}
