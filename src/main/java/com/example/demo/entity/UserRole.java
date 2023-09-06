 package com.example.demo.entity;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userRoleId;
	
	@ManyToOne(fetch= FetchType.EAGER)
	private User user;
	
	@ManyToOne(fetch= FetchType.EAGER)
	private Role role;
	@Override
    public int hashCode() {
        return Objects.hash(user, role);
    }
}
