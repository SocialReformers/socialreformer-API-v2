package main.java.com.socialreformer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.java.com.socialreformer.DAO.ISocialOrganizationsDAO;
import main.java.com.socialreformer.DAO.SocialOrganizationsDAO;
import main.java.com.socialreformer.service.EventService;
import main.java.com.socialreformer.service.EventServiceImpl;
import main.java.com.socialreformer.service.SocialOrganizationService;
import main.java.com.socialreformer.service.SocialOrganizationServiceImpl;

@Configuration
public class ApplicationConfig {

	@Bean
	EventService eventService() {
		return new EventServiceImpl();
	}
	
	@Bean
	SocialOrganizationService socialOrgService(){
		return new SocialOrganizationServiceImpl();
	}
	
	@Bean
	ISocialOrganizationsDAO socialOrgDAO(){
		return new SocialOrganizationsDAO();
	}
}
