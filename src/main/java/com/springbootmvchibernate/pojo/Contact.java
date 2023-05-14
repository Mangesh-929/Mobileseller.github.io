package com.springbootmvchibernate.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name="contactdata")
public class Contact {
	 @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	private String name;
	private String email;
	private String message;
	public Contact() {
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
