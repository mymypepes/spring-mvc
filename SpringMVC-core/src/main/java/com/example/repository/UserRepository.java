package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{
	
//	UserEntity findByFullName(String fullName);
}
