package com.socialreformer.service;

import java.util.List;

import com.socialreformer.model.Events;
import com.socialreformer.model.UserEvents;



public interface EventService{
	
	public Events createEvent(Events event);
	public UserEvents joinEvent(UserEvents userEvents);
	public long numberOfEventParticipants(Integer eventId);
	public List<Events> retrieveEventsNearYou(String city);
}
