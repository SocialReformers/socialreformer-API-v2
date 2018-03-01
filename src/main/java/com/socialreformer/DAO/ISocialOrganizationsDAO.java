package main.java.com.socialreformer.DAO;

import java.util.List;

import main.java.com.socialreformer.model.SocialOrganizations;

public interface ISocialOrganizationsDAO {
	
	public List<SocialOrganizations> getListOFSocialOrg(String cause);

}
