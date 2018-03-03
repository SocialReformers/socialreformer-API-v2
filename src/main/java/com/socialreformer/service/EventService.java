package main.java.com.socialreformer.service;

import main.java.com.socialreformer.model.Events;
import main.java.com.socialreformer.model.UserEvents;



public interface EventService{
	
	public void createEvent(Events event);
	public void joinEvent(UserEvents userEvents);
	public long numberOfEventParticipants(Integer eventId);

}
