package com.ud.demo.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;





@Entity
@Table(name = "Project")
public class Project
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int projid;
	private String proj_name;
	private String proj_duration;
	
	

	public int getProjid() {
		return projid;
	}

	public void setProjid(int projid) {
		this.projid = projid;
	}

	public String getProj_name() {
		return proj_name;
	}

	public void setProj_name(String proj_name) {
		this.proj_name = proj_name;
	}

	public String getProj_duration() {
		return proj_duration;
	}

	public void setProj_duration(String proj_duration) {
		this.proj_duration = proj_duration;
	}

	

	
	

	
}


