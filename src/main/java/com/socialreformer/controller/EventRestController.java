package main.java.com.socialreformer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import main.java.com.socialreformer.model.SocialOrganizations;
import main.java.com.socialreformer.service.EventService;
import main.java.com.socialreformer.service.SocialOrganizationService;

@RestController(value = "/socialReformer/ngos")
@CrossOrigin(origins = "http://localhost:8100")
public class EventRestController {
	@Autowired
	SocialOrganizationService socialOrgService;

	@RequestMapping(method = RequestMethod.GET)
	public List<SocialOrganizations> getEventsList() {
		System.out.println("Hello am server");
		return socialOrgService.getListOFSocialOrg("Child Safety");
	}

}
