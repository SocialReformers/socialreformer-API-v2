package com.socialreformer.service;

import com.socialreformer.model.RegisteredUser;

public interface RegisterUserService {

	public RegisteredUser registerUser(RegisteredUser user);	
	
	public long autheticateUser(String emailAddr,String password);

}
