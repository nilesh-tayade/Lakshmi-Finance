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

import com.fleeter.entities.inside.OperationExecutive;
import com.fleeter.repository.OperationalExecutiveRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/operationExecutive")
public class OperationExecutiveController {
	
	
	@Autowired
	private OperationalExecutiveRepository operationalExecutiveRepository;
	
	@PostMapping("/")
	public OperationExecutive saveOperationExecutive(@RequestBody OperationExecutive operationExecutive)
	{
		operationExecutive.setRole("operationExecutive");
		return operationalExecutiveRepository.save(operationExecutive);
	}
	
	@GetMapping("/")
	public List<OperationExecutive> getAllOperationExecutive()
	{
		return operationalExecutiveRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public OperationExecutive getOperationExecutiveById(@PathVariable("id") int id)
	{
		return operationalExecutiveRepository.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	public void deleteOperationExecutiveById(@PathVariable("id") int id)
	{
		 operationalExecutiveRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public OperationExecutive updateOperationExecutiveById(@RequestBody OperationExecutive operationExecutive,@PathVariable("id") int id)
	{
		operationExecutive.setId(id);
		return operationalExecutiveRepository.save(operationExecutive);
	}

}
