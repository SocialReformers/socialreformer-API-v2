package com.socialreformer.service;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.socialreformer.Repository.CauseRepository;
import com.socialreformer.Repository.ComplaintsRepository;
import com.socialreformer.Repository.SocialOrganizationsRepository;
import com.socialreformer.model.Cause;
import com.socialreformer.model.Complaints;
import com.socialreformer.model.SocialOrganizations;
import com.socialreformer.model.DTO.ComplaintDetailsDTO;

import ch.qos.logback.core.net.SyslogOutputStream;

import org.dozer.DozerBeanMapper;
@Service
public class ComplaintServiceImpl implements ComplaintService{
	@Resource
	private CauseRepository causeRepository;
	@Resource 
	private ComplaintsRepository complaintRepository;
	@Resource
	private SocialOrganizationsRepository socialOrganizationsRepository;
	
	@Autowired
	private EmailSendService emailSendService;


    @Transactional(readOnly=true)
	public List<Cause> retrieveCause(){
    	System.out.println("Inside complaint service");
		return causeRepository.findAll();
	}
	
	public void createComplaints(ComplaintDetailsDTO complaintDTO){
		 Complaints complaints = new DozerBeanMapper().map(complaintDTO, Complaints.class);
		complaintRepository.save(complaints);
		emailSendService.getJavaMailSender(complaintDTO);
	}
    @Transactional(readOnly=true)
	@Override
	public List<SocialOrganizations> retriveNGOs(String cause, String city) {
	
		return socialOrganizationsRepository.searchByNGOCauseAndCity(cause, city);
	}
}
