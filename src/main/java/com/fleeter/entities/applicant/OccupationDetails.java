package com.fleeter.entities.applicant;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OccupationDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String TitleofEmployer;
	private String detailsOfEmployer;
	private String designation;
	private Date  dateOfJoin;
	private String durationOfService;
	private Date  dateOfRetirement;
	
	
	
}
