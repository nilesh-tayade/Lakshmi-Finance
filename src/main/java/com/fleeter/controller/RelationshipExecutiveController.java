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
import com.fleeter.entities.inside.RelationshipExecutive;
import com.fleeter.repository.RelashionshipExecutiveRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/relationshipExecutive")
public class RelationshipExecutiveController {
	
	
	@Autowired
	private RelashionshipExecutiveRepository relashionshipExecutiveRepository;
	
	@PostMapping("/")
	public RelationshipExecutive saveRelationshipExecutive(@RequestBody RelationshipExecutive relationshipExecutive)
	{
		relationshipExecutive.setRole("relationshipExecutive");
		return relashionshipExecutiveRepository.save(relationshipExecutive);
	}
	
	@GetMapping("/")
	public List<RelationshipExecutive> getAllApplicant()
	{
		return relashionshipExecutiveRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public RelationshipExecutive getRelationshipExecutiveById(@PathVariable("id") int id)
	{
		return relashionshipExecutiveRepository.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	public void deleteRelationshipExecutiveById(@PathVariable("id") int id)
	{
		relashionshipExecutiveRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public RelationshipExecutive updateRelationshipExecutiveById(@RequestBody RelationshipExecutive relationshipExecutive,@PathVariable("id") int id)
	{
		relationshipExecutive.setId(id);
		return relashionshipExecutiveRepository.save(relationshipExecutive);
	}

	
}
