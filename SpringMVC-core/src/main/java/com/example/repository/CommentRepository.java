package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.CommentEntity;

public interface CommentRepository extends JpaRepository<CommentEntity, String>{

}
