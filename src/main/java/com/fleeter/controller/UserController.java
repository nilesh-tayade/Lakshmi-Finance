package com.fleeter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleeter.entities.applicant.LoginRequest;
import com.fleeter.entities.applicant.User;
import com.fleeter.repository.UserRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/login")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/")
	public User userRepository(@RequestBody LoginRequest loginRequest)
	{
		return userRepository.findByUsernameAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
	}
	
	
}
