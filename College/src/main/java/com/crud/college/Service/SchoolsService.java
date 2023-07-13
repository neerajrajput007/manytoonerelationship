package com.crud.college.Service;

import com.crud.college.Model.Schools;

import java.util.List;

public interface SchoolsService {

	List<Schools> getAllSchools();

	void saveOrUpdate(Schools schools);

	void delete(int id);

	Schools getSchoolsById(int id);

}
