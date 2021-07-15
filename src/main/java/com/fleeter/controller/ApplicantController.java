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

import com.fleeter.entities.applicant.Applicant;
import com.fleeter.repository.ApplicantRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/applicant")
public class ApplicantController {
	
	
	@Autowired
	private ApplicantRepository applicantRepository;
	
	@PostMapping("/")
	public Applicant saveApplicant(@RequestBody Applicant applicant)
	{
		return applicantRepository.save(applicant);
	}
	
	@GetMapping("/")
	public List<Applicant> getAllApplicant()
	{
		return applicantRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Applicant getApplicantById(@PathVariable("id") int id)
	{
		return applicantRepository.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	public void deleteApplicantById(@PathVariable("id") int id)
	{
		 applicantRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Applicant updateApplicantById(@RequestBody Applicant applicant,@PathVariable("id") int id)
	{
		applicant.setId(id);
		return applicantRepository.save(applicant);
	}

}
