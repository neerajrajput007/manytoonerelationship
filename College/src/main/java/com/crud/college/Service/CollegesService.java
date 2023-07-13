package com.crud.college.Service;

import java.util.List;

import com.crud.college.Model.Colleges;

public interface CollegesService {

	List<Colleges> getAllColleges();

	void saveOrUpdate(Colleges colleges);

	Colleges getCollegesById(int id);

	void delete(int id);

}
