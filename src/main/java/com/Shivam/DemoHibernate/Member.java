package com.Shivam.DemoHibernate;

import jakarta.persistence.Embeddable;

//Embeddable annotation embeds an object into another table and not create a separate table. Using Entity annotation would create a separate table.
@Embeddable 
public class Member {
	
	private String fName;
	private String mName;
	private String lName;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Member [fName=" + fName + ", mName=" + mName + ", lName=" + lName + "]";
	}
	
}
