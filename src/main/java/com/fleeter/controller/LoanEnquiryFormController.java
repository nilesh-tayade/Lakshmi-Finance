package com.fleeter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleeter.entities.applicant.LoanEnquiryForm;
import com.fleeter.repository.LoanEnquiryFormRepository;




@RestController
@CrossOrigin("*")
@RequestMapping("/loanEnquiryForm")
public class LoanEnquiryFormController {

	@Autowired
	private LoanEnquiryFormRepository loanEnquiryFormRepository;
	
	@PostMapping("/")
	public LoanEnquiryForm saveLoanEnquiryForm(@RequestBody LoanEnquiryForm loanEnquiryForm)
	{
		return loanEnquiryFormRepository.save(loanEnquiryForm);
	}
	
	@GetMapping("/")
	public List<LoanEnquiryForm> getLoanEnquiryForm()
	{
		return loanEnquiryFormRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public LoanEnquiryForm getLoanEnquiryFormById(@PathVariable("id") int id)
	{
		return loanEnquiryFormRepository.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	public void deleteLoanEnquiryFormById(@PathVariable("id") int id)
	{
		 loanEnquiryFormRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public LoanEnquiryForm updateApplicantById(@RequestBody LoanEnquiryForm loanEnquiryForm,@PathVariable("id") int id)
	{
		loanEnquiryForm.setId(id);
		return loanEnquiryFormRepository.save(loanEnquiryForm);
	}
	

	
	
}
