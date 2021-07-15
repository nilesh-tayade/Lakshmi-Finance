package com.fleeter.entities.applicant;

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
@AllArgsConstructor
@NoArgsConstructor
public class ExistingLoanDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String NameofBank;
	@OneToOne
	private LoanType loantype;
	private Long amountOfLoan;
	private Long outstatndingAmount;
	private String repaymentPlan;
	private String amountOfDefault =null;
	
	
}
