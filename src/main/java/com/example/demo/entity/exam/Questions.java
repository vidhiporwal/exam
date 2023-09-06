package com.example.demo.entity.exam;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Questions {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long quesId;
	private String content;
	private String image;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String answer ;
	@ManyToOne(fetch = FetchType.EAGER)
	private Quiz quiz;
}
