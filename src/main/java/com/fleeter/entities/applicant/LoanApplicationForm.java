package com.fleeter.entities.applicant;

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
@AllArgsConstructor
@NoArgsConstructor
public class LoanApplicationForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	 @OneToOne
	private Applicant applicant;
	 
	private Long loanAmount;
	
	 @OneToOne
	private LoanType  loanType;
	 
	 @OneToOne(cascade = CascadeType.ALL) 
	private BankDetails bankDetails;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	private IncomeStatement incomeStatement;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	private OccupationDetails occupationDetails;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	private CreditCardDetails creditCardDetails;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	private ExistingLoanDetails existingLoanDetails;
	 
	private String status;
	private String remark;
	private String civilScore;
	private boolean isDocumentVerified= false;
	
}
