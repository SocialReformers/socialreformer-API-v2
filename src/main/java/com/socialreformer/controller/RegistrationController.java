package main.java.com.socialreformer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.socialreformer.Repository.RegisteredUserRepository;
import main.java.com.socialreformer.model.Events;
import main.java.com.socialreformer.model.RegisteredUser;

@RestController
@RequestMapping(value = "/socialReformer/register")
public class RegistrationController {

	
	@Autowired
	RegisteredUserRepository registedUserRepository;
	
	@PostMapping("/user")
	public RegisteredUser registerUser(@Valid @RequestBody RegisteredUser regUser){
		return registedUserRepository.save(regUser);
	}
	

	
}
