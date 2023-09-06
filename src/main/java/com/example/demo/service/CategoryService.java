package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.exam.Category;

@Service
public interface CategoryService {
	
	Category add(Category category);

}
