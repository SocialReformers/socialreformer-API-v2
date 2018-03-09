package com.socialreformer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.socialreformer.model.Events;
import com.socialreformer.model.UserEvents;
import com.socialreformer.service.EventService;

@RestController
@RequestMapping(value="/socialReformer/events")
public class EventRestController {
	@Autowired
	EventService eventService;

	@PostMapping("/createEvent/events")
	public Events createEvents(@Valid @RequestBody Events event) {
		return eventService.createEvent(event);
	}

	@PostMapping("/join/userevent")
	public  UserEvents createComplaint(@Valid @RequestBody UserEvents userEvent) {
		return eventService.joinEvent(userEvent);
	}

	@RequestMapping(value="/participants",method=RequestMethod.GET)
	public long noOfParticipants(@RequestParam(value="eventId",required=true) Integer eventId) {
		return eventService.numberOfEventParticipants(eventId);
	}
	@RequestMapping(value="/nearYou",method=RequestMethod.GET)
	public List<Events> retrieveEventsNearYou(/*@RequestParam(value="city",required=true) String city*/) {
		List<Events> li=eventService.retrieveEventsNearYou();
		return li;
	}
	
	@RequestMapping(value="/eventDetails",method=RequestMethod.GET)
	public Events retrieveEventDetails(@RequestParam(value="eventId",required=true) Integer id) {		
		return eventService.retrieveEventDetails(id);
	}
	
	
	
}
