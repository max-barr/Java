package com.maxbarr.events.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maxbarr.events.models.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Long>{

	
	List<Event> findAll();
	
//	Find an event by state
	
	List<Event> findByState(String state);
}
