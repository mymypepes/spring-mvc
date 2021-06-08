package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.NewsEntity;

public interface NewsRepository extends JpaRepository<NewsEntity, String>{

}
