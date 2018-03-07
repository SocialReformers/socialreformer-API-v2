package com.socialreformer.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.socialreformer.model.Events;

public interface EventsRepository extends JpaRepository<Events, Integer>{
	
	@Query("Select event from Events event ")
	public List<Events> searchByCityAndEventDate(/*@Param("city") String city*/);
}
