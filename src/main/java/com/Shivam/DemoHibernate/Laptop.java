package com.Shivam.DemoHibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity	
public class Laptop {
	
	@Id
	private int lId;
	private String lName;
	
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", lName=" + lName + "]";
	}
	
}
