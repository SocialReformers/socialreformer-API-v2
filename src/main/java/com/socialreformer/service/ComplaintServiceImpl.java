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
		return causeRepository.findAll();
	}
	
	public void createComplaints(Complaints complaint){
		complaintRepository.save(complaint);
		emailSendService.getJavaMailSender();
	}
    @Transactional(readOnly=true)
	@Override
	public List<SocialOrganizations> retriveNGOs(String cause, String city) {
	
		return socialOrganizationsRepository.searchByNGOCauseAndCity(cause, city);
	}
}
