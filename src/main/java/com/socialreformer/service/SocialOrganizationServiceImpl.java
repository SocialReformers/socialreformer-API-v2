package main.java.com.socialreformer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.socialreformer.DAO.ISocialOrganizationsDAO;

import main.java.com.socialreformer.model.SocialOrganizations;

public class SocialOrganizationServiceImpl implements SocialOrganizationService{
	@Autowired
	private ISocialOrganizationsDAO socialOrgDAO;
	
	public List<SocialOrganizations> getListOFSocialOrg(String cause){
		return socialOrgDAO.getListOFSocialOrg(cause);
	}

}
