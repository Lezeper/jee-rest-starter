package com.imlewis.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class User implements Serializable{
	
	private static final long serialVersionUID = -1141705572623300215L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("userId")
	private int userId;
	@JsonProperty("name")
	private String userName;
	@JsonProperty("age")
	private int userAge;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
}
