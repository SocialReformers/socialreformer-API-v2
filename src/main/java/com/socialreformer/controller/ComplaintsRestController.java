package com.socialreformer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.socialreformer.model.Cause;
import com.socialreformer.model.Complaints;
import com.socialreformer.model.RegisteredUser;
import com.socialreformer.model.SocialOrganizations;
import com.socialreformer.model.DTO.ComplaintDetailsDTO;
import com.socialreformer.service.ComplaintService;

@RestController
@RequestMapping(value = "/socialReformer/complaint")
public class ComplaintsRestController {
	@Autowired
	ComplaintService complaintService;	

	@RequestMapping(value="/cause",method = RequestMethod.GET)
	public List<Cause> retrieveCause(){
		return complaintService.retrieveCause();
	}
	
	@RequestMapping(value="/ngo",method = RequestMethod.GET)
	public List<SocialOrganizations> retriveNGOs(@RequestParam String cause,@RequestParam String city){
		return complaintService.retriveNGOs(cause,city);
	}

	@PostMapping("/complaint")
	public void createComplaint(@Valid @RequestBody ComplaintDetailsDTO complaintDTO){
		 complaintService.createComplaints(complaintDTO);
	}
	
	
	/*@RequestMapping(value="/complaint",method = RequestMethod.GET)
	public void createComplaints(@RequestParam String cause,@RequestParam String city){
		 complaintService.createComplaints();
	}*/

}
