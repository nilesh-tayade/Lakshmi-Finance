package com.fleeter.entities.inside;

import java.util.Set;

import com.fleeter.entities.applicant.LoanApplicationForm;
import com.fleeter.entities.applicant.LoanEnquiryForm;
import com.fleeter.entities.applicant.Person;

public class RelationshipExecutive {
	
	private int id;
	private Person person;
	private Set<LoanApplicationForm> loanApplicationForms;
	private Set<LoanEnquiryForm>   enquiries;
	private Set<LoanApplicationForm> approvedApplicationForms;
	private Set<LoanApplicationForm> declinedApplicationForms;
	private Set<LoanEnquiryForm>   eligibleInQuiries;
	private Set<LoanEnquiryForm>   noteligibleInQuiries;

	
	private Set<SanctionLetter>    santionLetters;

	

}
