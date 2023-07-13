package com.crud.college.Service;

import java.util.ArrayList;
import java.util.List;

import com.crud.college.Dao.CollegesDao;
import com.crud.college.Model.Colleges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegesServiceImp implements CollegesService {

	@Autowired
	CollegesDao dao;

	@Override
	public List<Colleges> getAllColleges() {
		List<Colleges> colleges = new ArrayList<Colleges>();
		dao.findAll().forEach(college1 -> colleges.add(college1));
		return colleges;
	}

	@Override
	public Colleges getCollegesById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Colleges colleges) {
		dao.save(colleges);
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
	}

}
