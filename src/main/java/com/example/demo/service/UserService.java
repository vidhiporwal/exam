package com.example.demo.service;

import java.util.Set;

import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;

public interface UserService {
	
	User createUser(User user,Set<UserRole>userRoles) throws Exception ;
	
	//get user by username
    public User getUser(String username);

	void deleteUser(Long userId);

}
