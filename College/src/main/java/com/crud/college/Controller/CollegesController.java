package com.crud.college.Controller;

import java.util.List;

import com.crud.college.Dao.CollegesDao;
import com.crud.college.Model.Colleges;
import com.crud.college.Service.CollegesService;
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
@RequestMapping("collegesdetails")
public class CollegesController {

	@Autowired
	private CollegesDao collegeDao;
	@Autowired
	private CollegesService collegesService;

	@PostMapping("/postCollege")
	public String postCollege(@RequestBody Colleges colleges) {
		System.out.println(colleges);
		collegeDao.save(colleges);
		return "success";
	}

	@GetMapping("/getCollege")
	public List<Colleges> getCollege() {

		List<Colleges> college = collegeDao.findAll();
		return college;
	}




	@GetMapping("/collegess")
	private List<Colleges> getAllColleges() {
		return collegesService.getAllColleges();
	}

	@GetMapping("/colleges")
	private Colleges getColleges(@RequestHeader("id") int id) {
		return collegesService.getCollegesById(id);
	}

	@PostMapping("/colleges")
	private Colleges saveColleges(@RequestBody Colleges colleges) {
		System.out.println(colleges);
		collegesService.saveOrUpdate(colleges);
		return colleges;
	}

	@PutMapping("/colleges")
	private Colleges update(@RequestBody Colleges colleges) {
		collegesService.saveOrUpdate(colleges);
		return colleges;
	}

	@DeleteMapping("/colleges")
	private void deleteColleges(@RequestHeader("id") int id) {
		collegesService.delete(id);
	}
}