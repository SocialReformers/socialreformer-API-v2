package main.java.com.socialreformer.service;

import java.util.List;

import main.java.com.socialreformer.model.SocialOrganizations;

public interface SocialOrganizationService {
	public List<SocialOrganizations> getListOFSocialOrg(String cause);
}
