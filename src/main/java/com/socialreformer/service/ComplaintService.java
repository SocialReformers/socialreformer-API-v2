package main.java.com.socialreformer.service;

import java.util.List;

import main.java.com.socialreformer.model.Cause;
import main.java.com.socialreformer.model.Complaints;
import main.java.com.socialreformer.model.SocialOrganizations;

public interface ComplaintService {
	public List<Cause> retrieveCause();

	public void createComplaints(Complaints complaint);

	public List<SocialOrganizations> retriveNGOs(String cause, String city);
}
