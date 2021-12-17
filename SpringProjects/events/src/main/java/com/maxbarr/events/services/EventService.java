package com.maxbarr.events.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxbarr.events.models.Event;
import com.maxbarr.events.repositories.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepository;
	
//	Create a new event
	
	public Event createEvent(Event event) {
		return eventRepository.save(event);
	}
	
//	Return all events
	
	public List<Event> allEvents() {
		return eventRepository.findAll();
	}
	
//	Save an event
	
	public Event saveEvent(Event event) {
		return eventRepository.save(event);
	}
	
//	Update an event
	
	public Event updateEvent(Event event) {
		return eventRepository.save(event);
	}
	
//	Find an event by id
	
	public Event findEvent(Long id) {
		
		return eventRepository.findById(id).orElse(null);
				
//		Optional<Event> optionalEvent = eventRepository.findById(id);
//		if (optionalEvent.isPresent()) {
//			return optionalEvent.get();
//		} else {
//			return null;
//		}
	}
	
//	Delete an event
	
	public void delete(Long id) {
		eventRepository.deleteById(id);
	}
}
