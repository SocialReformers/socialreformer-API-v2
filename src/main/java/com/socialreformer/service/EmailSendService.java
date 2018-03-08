package com.socialreformer.service;

import org.springframework.mail.javamail.JavaMailSender;

import com.socialreformer.model.DTO.ComplaintDetailsDTO;

public interface EmailSendService {
	public boolean getJavaMailSender(ComplaintDetailsDTO complaintDTO) ;
}
