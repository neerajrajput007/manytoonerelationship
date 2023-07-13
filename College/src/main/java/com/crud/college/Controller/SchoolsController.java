package com.crud.college.Controller;

import java.util.List;

import com.crud.college.Model.Schools;
import com.crud.college.Service.SchoolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("schoolsdetails")
public class SchoolsController {

	@Autowired
	private SchoolsService schoolsService;

	@GetMapping("/schoolss")
	private List<Schools> getAllSchools() {
		return schoolsService.getAllSchools();
	}

	@GetMapping("/schools")
	private Schools getSchools(@RequestHeader("id") int id) {
		return schoolsService.getSchoolsById(id);
	}

	@PostMapping("/schools")
	private Schools saveSchools(@RequestBody Schools schools) {
		schoolsService.saveOrUpdate(schools);
		return schools;
	}

	@PutMapping("/schools")
	private Schools update(@RequestBody Schools schools) {
		schoolsService.saveOrUpdate(schools);
		return schools;
	}

	@DeleteMapping("/schools ")
	private void deleteSchools(@RequestHeader("id") int id) {
		schoolsService.delete(id);
	}

}
