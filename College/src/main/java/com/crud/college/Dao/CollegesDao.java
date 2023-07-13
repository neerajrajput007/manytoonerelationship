package com.crud.college.Dao;

import com.crud.college.Model.Colleges;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CollegesDao extends JpaRepository<Colleges, Integer> {

}
