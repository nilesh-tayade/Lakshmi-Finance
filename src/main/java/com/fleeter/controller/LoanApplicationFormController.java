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

import com.fleeter.entities.applicant.LoanApplicationForm;
import com.fleeter.repository.LoanApplicationFormRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/loanApplicationForm")
public class LoanApplicationFormController {
	
	@Autowired
	private LoanApplicationFormRepository applicationFormRepository;
	
	@PostMapping("/")
	public LoanApplicationForm saveLoanApplicationForm(@RequestBody LoanApplicationForm loanApplicationForm)
	{
		return applicationFormRepository.save(loanApplicationForm);
	}
	
	@GetMapping("/")
	public List<LoanApplicationForm> getLoanApplicationForm()
	{
		return applicationFormRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public LoanApplicationForm getLoanApplicationFormById(@PathVariable("id") int id)
	{
		return applicationFormRepository.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	public void deleteLoanApplicationFormById(@PathVariable("id") int id)
	{
		 applicationFormRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public LoanApplicationForm updateApplicantById(@RequestBody LoanApplicationForm loanApplicationForm,@PathVariable("id") int id)
	{
		loanApplicationForm.setId(id);
		return applicationFormRepository.save(loanApplicationForm);
	}
	

}
