package com.hospitalManagement.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class patientDetails {
	@Id
	
	private int id;
	private String name;
	private int age;
	private String address;
	private String bedno; 
	public int getId() {
		return id;
	}
	public String getBedno() {
		return bedno;
	}
	public void setBedno(String bedno) {
		this.bedno = bedno;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	private String idProof;

    private String nurseName;

	private String doctorname2;


}
