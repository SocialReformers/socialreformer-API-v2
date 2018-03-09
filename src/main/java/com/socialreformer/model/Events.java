package com.socialreformer.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "EVENTS")
public class Events {

	@Id
	@Column(name = "EVENT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String name;

	private String description;

	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd") 
	@Column(name = "EVENT_DATE")
	private Date eventDate;

	@Column(name = "CREATED_BY")
	private Integer createdby;

	private String locality;

	private String city;

	private String state;

	private String details;
	
	@Column(name = "CONTACT_NO")
	private String contactNo;

	@Column(name = "NOTIFY_SENT")
	private String notificationSent;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "event")
	@JsonManagedReference 
	private Set<UserEvents> userEvents;

	public Events(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getNotificationSent() {
		return notificationSent;
	}

	public void setNotificationSent(String notificationSent) {
		this.notificationSent = notificationSent;
	}

	public Set<UserEvents> getUserEvents() {
		return userEvents;
	}

	public void setUserEvents(Set<UserEvents> userEvents) {
		this.userEvents = userEvents;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
}
