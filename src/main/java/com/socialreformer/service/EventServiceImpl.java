package com.socialreformer.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.socialreformer.Repository.EventsRepository;
import com.socialreformer.Repository.UserEventsRepository;
import com.socialreformer.model.Events;
import com.socialreformer.model.UserEvents;

@Service
public class EventServiceImpl implements EventService{
	
	@Resource
	EventsRepository eventRepository;
	@Resource
	UserEventsRepository userEventRepository;

	public Events createEvent(Events event){
		return eventRepository.save(event);
	}
	
	public UserEvents joinEvent(UserEvents userEvents){
		return userEventRepository.save(userEvents);
	}
	
	public long numberOfEventParticipants(Integer eventId){
		return userEventRepository.countByEventId(eventId);
	}
	
	public List<Events> retrieveEventsNearYou(String city){
		return eventRepository.searchByCityAndEventDate(city);
	}
}
