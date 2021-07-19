package com.ud.demo.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import ch.qos.logback.core.subst.Token.Type;


@Entity
@Table(name = "Student")
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String Name;
	private String Lname;
	private String PhoneNumber;
	@Column(unique = true)
	private String email;
	
	@ManyToMany(targetEntity = Project.class,cascade = CascadeType.ALL)
	 private List<Project> proj;
	 
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Project> getProj() {
		return proj;
	}

	public void setProj(List<Project> proj) {
		this.proj = proj;
	}

	
	/**/
}
/*
-first name
-last name
-mobile number
-email address
-project

	*/
