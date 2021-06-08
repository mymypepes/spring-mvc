package com.example.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="role")
public class RoleEntity extends BaseEntity{
	@Id
	@Column(name="role_id")
	private String roleId;
	
	@Column(name="role_name")
	private String roleName;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="user_role", joinColumns = @JoinColumn(name="role_id"), inverseJoinColumns = @JoinColumn(name="user_name"))
	private Set<UserEntity> users;
	

	public Set<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(Set<UserEntity> users) {
		this.users = users;
	}

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

	

}
