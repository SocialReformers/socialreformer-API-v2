package com.socialreformer.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.socialreformer.Repository.RegisteredUserRepository;
import com.socialreformer.model.RegisteredUser;

@Service
public class RegisterUserServiceImpl implements RegisterUserService {

	@Resource
	RegisteredUserRepository registerUserRepository;

	public RegisteredUser registerUser(RegisteredUser user){
		return registerUserRepository.save(user);
	}
	
	public long autheticateUser(String emailAddr,String password){
		return registerUserRepository.countByEmailAddrAndPassword(emailAddr, password);		
	}
	
	public Integer retrievRegisteredUserByMail(String email){
		return registerUserRepository.findByEmailAddr(email);
	}
}
