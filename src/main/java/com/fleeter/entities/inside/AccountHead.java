package com.fleeter.entities.inside;

import java.util.Set;

import com.fleeter.entities.applicant.LoanApplicationForm;
import com.fleeter.entities.applicant.Person;
import com.fleeter.entities.applicant.User;

public class AccountHead extends User {

	private Person person;
	private Set<SanctionLetter>    santionLetters;
	
	
	private Set<SanctionLetter>    processedSantionLetters;
	private Set<SanctionLetter>    loanDisbursedSantionLetters;
	private Set<SanctionLetter>    ledgerCreatedSantionLetters;
}
