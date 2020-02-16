package com.mvc.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Covek {

	@Id
	private int id;
	private String name;
	
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
	
	@Override
	public String toString() {
		return "Covek [id=" + id + ", name=" + name + "]";
	}
	
}
