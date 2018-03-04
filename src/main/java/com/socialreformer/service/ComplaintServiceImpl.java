package main.java.com.socialreformer.service;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.socialreformer.Repository.CauseRepository;
import main.java.com.socialreformer.Repository.ComplaintsRepository;
import main.java.com.socialreformer.Repository.SocialOrganizationsRepository;
import main.java.com.socialreformer.model.Cause;
import main.java.com.socialreformer.model.Complaints;
import main.java.com.socialreformer.model.SocialOrganizations;

@Service
public class ComplaintServiceImpl implements ComplaintService{
	@Resource
	private CauseRepository causeRepository;
	@Resource 
	private ComplaintsRepository complaintRepository;
	@Resource
	private SocialOrganizationsRepository socialOrganizationsRepository;

    @Transactional(readOnly=true)
	public List<Cause> retrieveCause(){
		return causeRepository.findAll();
	}
	
	public void createComplaints(Complaints complaint){
		complaintRepository.save(complaint);
	}
    @Transactional(readOnly=true)
	@Override
	public List<SocialOrganizations> retriveNGOs(String cause, String city) {
	
		return socialOrganizationsRepository.searchByNGOCauseAndCity(cause, city);
	}
}
