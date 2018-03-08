package com.socialreformer.service;

import java.util.List;

import com.socialreformer.model.Cause;
import com.socialreformer.model.Complaints;
import com.socialreformer.model.SocialOrganizations;
import com.socialreformer.model.DTO.ComplaintDetailsDTO;

public interface ComplaintService {
	public List<Cause> retrieveCause();

	public void createComplaints(ComplaintDetailsDTO complaintDetailsDTO);

	public List<SocialOrganizations> retriveNGOs(String cause, String city);
}
