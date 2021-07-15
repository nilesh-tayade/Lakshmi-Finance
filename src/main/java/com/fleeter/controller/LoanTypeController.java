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

import com.fleeter.entities.applicant.LoanType;
import com.fleeter.repository.LoanTypeRepository;


@RestController
@CrossOrigin("*")
@RequestMapping("/loanType")
public class LoanTypeController {

	@Autowired
	private LoanTypeRepository loanTypeRepository;
	
	@PostMapping("/")
	public LoanType saveLoanType(@RequestBody LoanType loanType)
	{
		return loanTypeRepository.save(loanType);
	}
	
	@GetMapping("/")
	public List<LoanType> getAllLoanTypes()
	{
		return loanTypeRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public LoanType getLoanTypeById(@PathVariable("id") int id)
	{
		return loanTypeRepository.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	public void deletLoanTypeById(@PathVariable("id") int id)
	{
		loanTypeRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public LoanType updateLoanTypetById(@RequestBody LoanType loanType,@PathVariable("id") int id)
	{
		loanType.setId(id);
		return loanTypeRepository.save(loanType);
	}
	
}
