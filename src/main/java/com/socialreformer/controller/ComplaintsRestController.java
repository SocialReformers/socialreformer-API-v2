package main.java.com.socialreformer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.socialreformer.model.Cause;
import main.java.com.socialreformer.model.Complaints;
import main.java.com.socialreformer.model.RegisteredUser;
import main.java.com.socialreformer.service.ComplaintService;

@RestController
@RequestMapping(value = "/socialReformer/complaint")
public class ComplaintsRestController {
	@Autowired
	ComplaintService complaintService;	

	@RequestMapping(value="/cause",method = RequestMethod.GET)
	public List<Cause> retrieveCause(){
		return complaintService.retrieveCause();
	}
	

	@PostMapping("/complaint")
	public void createComplaint(@Valid @RequestBody Complaints complaint){
		 complaintService.createComplaints(complaint);
	}
	
	
	

}
