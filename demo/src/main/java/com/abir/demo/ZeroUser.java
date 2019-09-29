package com.abir.demo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ZeroUser {
	
	private int id;
	private String name;
	private int usercat;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUsercat() {
		return usercat;
	}
	public void setUsercat(int usercat) {
		this.usercat = usercat;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "ZeroUser [id=" + id + ", name=" + name + ", usercat=" + usercat + ", email=" + email + "]";
	}

}
