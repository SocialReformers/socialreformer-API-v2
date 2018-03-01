package main.java.com.socialreformer.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import main.java.com.socialreformer.model.SocialOrganizations;

@Transactional
@Repository
public class SocialOrganizationsDAO implements ISocialOrganizationsDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	
	public List<SocialOrganizations> getListOFSocialOrg(String cause){
		System.out.println(cause);
		return (List<SocialOrganizations>)entityManager.createQuery("from SocialOrganizations").getResultList();
}
}
