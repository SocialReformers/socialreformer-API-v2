package com.socialreformer.service;

import org.springframework.mail.javamail.JavaMailSender;

public interface EmailSendService {
	public JavaMailSender getJavaMailSender() ;
}
