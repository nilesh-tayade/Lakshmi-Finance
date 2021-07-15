package com.fleeter.entities.applicant;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstname ; 
	private String lastname ; 
	private String fathername;
	private String email ;
	private String mobile;
	
	
	private Date dob;
	
	 @OneToOne(cascade = CascadeType.ALL)
	private Address address;
	private String gender;
	private String maritalStatus;
	private String religion;
	private String caste;


	
}
