package sef.module18.activity;

import java.util.List;

public class EmployeeImpl implements Employee {

	private int id;
	private String firstname;
	private String lastname;
	private int level;
	
	public EmployeeImpl(int id, String firstname, String lastname, int level){
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.level = level;
	}


	public int getEmployeeID() {
		return id;
	}


	public int getLevel() {
		return level;
	}

	
	public String getFirstName() {
		return firstname;
	}


	public String getLastName() {
		return lastname;
	}


	public void setEmployeeID(int id) {
		this.id = id;
	}


	public void setLevel(int level) {
		this.level = level;
	}

	
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
}
