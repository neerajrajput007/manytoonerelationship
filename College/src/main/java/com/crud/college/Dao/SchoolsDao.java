package com.crud.college.Dao;

import com.crud.college.Model.Schools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SchoolsDao extends JpaRepository<Schools, Integer> {

}
