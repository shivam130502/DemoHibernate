package com.Shivam.DemoHibernate;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity	
public class Student {

	@Id
	private int studentId;
	private String name;
	private int rollNumber;
	
	// relational mapping
	// mappedBy lets this class know that the mapping is already being done by another object.
	// Fetch type Eager is essentially the opposite of Lazy, Eager will by default load ALL of the relationships related to a particular object loaded by Hibernate.
	@OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
	private List<Laptop> laptop = new ArrayList();
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
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
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", rollNumber=" + rollNumber + ", laptop="
				+ laptop + "]";
	}
	
}
