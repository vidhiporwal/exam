package com.example.demo.serviceimpl;

import com.example.demo.entity.User;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = this.userRepository.findByUsername(username);
        if (user == null) {
            System.out.println("User not found");
            throw new UsernameNotFoundException("No user found !!");
        }

        return user;
    }
}
