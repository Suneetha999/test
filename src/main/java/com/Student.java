package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {	
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int studentId;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String lastyear;
	
	public Student(){}
	public Student(int studentId, String firstname, String lastname,String lastyear) {
		super();
		this.studentId = studentId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.lastyear=lastyear;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLastyear() {
		return lastyear;
	}
	public void setLastyear(String lastyear) {
		this.lastyear = lastyear;
	}
private void sout() {
		// TODO Auto-generated method stub

	}

}
