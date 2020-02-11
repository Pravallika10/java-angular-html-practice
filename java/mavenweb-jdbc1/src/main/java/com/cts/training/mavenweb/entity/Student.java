package com.cts.training.mavenweb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/*@Getter
@Setter
@AllArgsConstructor
@ToString*/
public class Student {

	private Integer id;
	private String name;
	private String email;
	private String country;
	public Student() {}

	
	public Student(Integer id, String name, String email,String country) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.country=country;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}		
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ",country=" + country +"]";
	}
	
	
	
}
