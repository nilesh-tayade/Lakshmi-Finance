package com.fleeter.entities.inside;

import java.util.Set;

import com.fleeter.entities.applicant.LoanApplicationForm;
import com.fleeter.entities.applicant.Person;
import com.fleeter.entities.applicant.User;

public class CreditManager extends User{

	
	private Person person;
	private Set<LoanApplicationForm> loanApplicationForms;
	private Set<LoanApplicationForm> fileOKLoanApplicationForms;
	private Set<LoanApplicationForm> fileNotOkloanApplicationForms;
	
}
