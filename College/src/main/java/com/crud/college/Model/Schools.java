package com.crud.college.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Schools {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int school_id;
	private String school_name;
	@ToString.Exclude
	@ManyToOne
	@JsonIgnore
	private Colleges colleges;

	public int getSchool_id() {
		return school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public Colleges getColleges() {
		return colleges;
	}

	public void setColleges(Colleges colleges) {
		this.colleges = colleges;
	}
}