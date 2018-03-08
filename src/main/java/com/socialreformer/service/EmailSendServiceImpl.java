package com.socialreformer.service;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

import com.socialreformer.model.DTO.ComplaintDetailsDTO;

@Component
public class EmailSendServiceImpl implements EmailSendService {
	   @Autowired
	    public JavaMailSender emailSender;
	public boolean getJavaMailSender(ComplaintDetailsDTO complaintDTO) {
	 
	    SimpleMailMessage message= new SimpleMailMessage();
	    message.setTo(complaintDTO.getTomailId());
	    message.setSubject(complaintDTO.getType());
	    message.setText("Hi"+"<br>"+complaintDTO.getDescription());
	    emailSender.send(message);
	    return true;
	  
	}
}
