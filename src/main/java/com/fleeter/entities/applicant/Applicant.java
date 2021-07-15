package com.fleeter.entities.applicant;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
public class Applicant extends User {
	
 @OneToOne(cascade = CascadeType.ALL)
	private Person person;
	private String aadhar;
	private String pan;

	

}
