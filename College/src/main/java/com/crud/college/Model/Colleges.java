package com.crud.college.Model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Colleges {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true)
	private int college_id;
	private String name;
	private int numberOfDepartment;
	private String department;
	@OneToMany(mappedBy = "colleges", cascade = CascadeType.ALL)
	private List<Schools> schools;

	public int getCollege_id() {
		return college_id;
	}

	public void setCollege_id(int college_id) {
		this.college_id = college_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfDepartment() {
		return numberOfDepartment;
	}

	public void setNumberOfDepartment(int numberOfDepartment) {
		this.numberOfDepartment = numberOfDepartment;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<Schools> getSchools() {
		return schools;
	}

	public void setSchools(List<Schools> schools) {
		this.schools = schools;
	}
}
