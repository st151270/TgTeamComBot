/**
 * 
 */
package de.hackathon.hackathon.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * @author Henne
 *
 */
public abstract class Body implements Serializable{
	
	private long key;
	private static final long serialVersionUID = -8966320631762198755L;
	private ArrayList<Event> events;
	
	/**
	 * Get's {@link #key key}
	 * @return  key
	 */
	public long getKey() {
		return this.key;
	}
	
	/**
	 * Set's {@link #key key}
	 * @param key  key
	 */
	public void setKey(long key) {
		this.key = key;
	}
	
	/**
	 * Get's {@link #events events}
	 * @return  events
	 */
	public List<Event> getEvents() {
		return this.events;
	}
	
	/**
	 * Set's {@link #events events}
	 * @param p_events  events
	 */
	public void setEvents(List<Event> p_events) {
		this.events = new ArrayList<>(p_events);
	}
	
	
}
