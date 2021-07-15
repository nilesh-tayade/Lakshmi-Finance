package com.fleeter.entities.inside;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fleeter.entities.applicant.LoanApplicationForm;
import com.fleeter.entities.applicant.Person;
import com.fleeter.entities.applicant.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OperationExecutive extends User {
	

	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Person person;
	
	@OneToMany
	private Set<LoanApplicationForm> loanApplicationForms;
	
	@OneToMany
	private Set<LoanApplicationForm> civilOkLoanApplicationForms;
	
	@OneToMany
	private Set<LoanApplicationForm> docVerifieApplicationForms;
	
	@OneToMany
	private Set<LoanApplicationForm> ApprovedloanApplicationForms;
	
	@OneToMany
	private Set<LoanApplicationForm> rejectedLoanApplicationForms;
	
//	@OneToMany
//	private Set<SanctionLetter>    santionLetters;
	
}
