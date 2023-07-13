package com.crud.college.Service;

import com.crud.college.Dao.SchoolsDao;
import com.crud.college.Model.Schools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolsServiceImp implements SchoolsService {
	@Autowired
	SchoolsDao dao;

	@Override
	public List<Schools> getAllSchools() {
		List<Schools> schools = new ArrayList<Schools>();
		dao.findAll().forEach(schools1 -> schools.add(schools1));
		return schools;
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
	}

	@Override
	public void saveOrUpdate(Schools schools) {
		dao.save(schools);

	}

	@Override
	public Schools getSchoolsById(int id) {

		return dao.findById(id).get();
	}

}
