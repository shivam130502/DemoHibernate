package com.Shivam.DemoHibernate;

// these imports are to assign keywords to class and variables.
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Entity keyword means object will be persisted(put/stored) in the database. 
@Entity	
public class Employee {
	
	// Id keyword denotes the unique primary key to be put in database.
	@Id
	private int employeeId;
	private Member member;
	private int employeeSalary;
	
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
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
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", member=" + member + ", employeeSalary=" + employeeSalary + "]";
	}
	
}
