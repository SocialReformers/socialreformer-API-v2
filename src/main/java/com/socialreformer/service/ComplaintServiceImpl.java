package main.java.com.socialreformer.service;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.socialreformer.Repository.CauseRepository;
import main.java.com.socialreformer.Repository.ComplaintsRepository;
import main.java.com.socialreformer.model.Cause;
import main.java.com.socialreformer.model.Complaints;

@Service
public class ComplaintServiceImpl implements ComplaintService{
	@Resource
	private CauseRepository causeRepository;
	@Resource 
	private ComplaintsRepository complaintRepository;

    @Transactional(readOnly=true)
	public List<Cause> retrieveCause(){
		return causeRepository.findAll();
	}
	
	public void createComplaints(Complaints complaint){
		complaintRepository.save(complaint);
	}
}
