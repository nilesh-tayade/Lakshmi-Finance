package com.fleeter.entities.inside;

import java.util.Set;

import com.fleeter.entities.applicant.LoanApplicationForm;
import com.fleeter.entities.applicant.Person;

public class OperationExecutive {
	
	private int id;
	private Person person;
	private Set<LoanApplicationForm> loanApplicationForms;
	private Set<LoanApplicationForm> civilOkLoanApplicationForms;
	private Set<LoanApplicationForm> docVerifieApplicationForms;
	private Set<LoanApplicationForm> ApprovedloanApplicationForms;
	private Set<LoanApplicationForm> rejectedLoanApplicationForms;
	private Set<SanctionLetter>    santionLetters;
	
}
