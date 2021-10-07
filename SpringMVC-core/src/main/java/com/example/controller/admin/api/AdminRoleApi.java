package com.example.controller.admin.api;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.admin.role.CreateRoleRequest;
import com.example.request.admin.role.UpdateRoleRequest;
import com.example.response.admin.CommonResponse;
import com.example.service.RoleService;

@RestController
public class AdminRoleApi {
	@Autowired
	private RoleService roleService;
	
	@PostMapping(value = "/api/role/create", consumes = "application/json")
	public ResponseEntity<CommonResponse> createRole(@Valid @RequestBody CreateRoleRequest request) {
		CommonResponse response = roleService.createRole(request);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping(value = "/api/role/update", consumes = "application/json")
	public ResponseEntity<CommonResponse> updateRole(@Valid @RequestBody UpdateRoleRequest request) {
		CommonResponse response = roleService.updateRole(request);
		return ResponseEntity.ok(response);
	}
	
	@DeleteMapping(value = "/api/user/delete/{role-name}")
	public ResponseEntity<CommonResponse> deleteRole(@Valid @PathVariable("role-name") @NotBlank @Size(min = 4, max = 20, message = "Độ dài của user_name từ 4-20 ký tự") String roleName) {
		CommonResponse response = roleService.deleteRole(roleName);
		return ResponseEntity.ok(response);
	}
}
