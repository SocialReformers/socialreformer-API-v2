package com.socialreformer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialreformer.model.UserEvents;

public interface UserEventsRepository  extends JpaRepository<UserEvents, Integer>{

	public long countByEventId(Integer eventId);
	
}
