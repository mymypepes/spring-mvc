package com.example.service;

import java.util.List;

import com.example.entity.RoleEntity;
import com.example.request.admin.role.CreateRoleRequest;
import com.example.request.admin.role.UpdateRoleRequest;
import com.example.response.admin.CommonResponse;

public interface RoleService {
	RoleEntity findByUserName(String userName);
	
	List<RoleEntity> findAll(); 
	
	public CommonResponse createRole(CreateRoleRequest request);
	
	public CommonResponse updateRole(UpdateRoleRequest request);
	
	public CommonResponse deleteRole(String roleName);
}
