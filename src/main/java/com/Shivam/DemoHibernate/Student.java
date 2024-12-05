package com.Shivam.DemoHibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity	
public class Student {

	@Id
	private int studentId;
	private String name;
	private int rollNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
}
