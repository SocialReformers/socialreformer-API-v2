package com.socialreformer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.socialreformer.Repository.RegisteredUserRepository;
import com.socialreformer.model.Events;
import com.socialreformer.model.RegisteredUser;
import com.socialreformer.service.RegisterUserService;

@RestController
@RequestMapping(value = "/socialReformer/register")
public class RegistrationController {

	
	@Autowired
	RegisterUserService registeredService;
	
	@PostMapping("/user")
	public RegisteredUser registerUser(@Valid @RequestBody RegisteredUser regUser){
		return registeredService.registerUser(regUser);
	}
	
   @PostMapping("/autheticate")
    public long autheticateUser(@Valid @RequestBody RegisteredUser regUser){	   
	   return registeredService.autheticateUser(regUser.getEmailAddr(), regUser.getPassword());
   }	
   @RequestMapping(value="/getUsrId",method=RequestMethod.GET)
	public Integer retrieveRegisterUserIDBymail(@RequestParam(value="email",required=true) String email) {		
	   return registeredService.retrievRegisteredUserByMail(email);
   }
}
