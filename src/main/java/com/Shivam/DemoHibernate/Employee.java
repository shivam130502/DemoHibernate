package com.Shivam.DemoHibernate;

// these imports are to assign keywords to class and variables.
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Entity keyword means object will be persisted in a database. 
@Entity	
public class Employee {
	
	// Id keyword denotes the unique primary key to be put in database.
	@Id
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	
	public String getName() {
		return employeeName;
	}
	public void setName(String name) {
		this.employeeName = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int id) {
		this.employeeId = id;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int salary) {
		this.employeeSalary = salary;
	}
	
}
