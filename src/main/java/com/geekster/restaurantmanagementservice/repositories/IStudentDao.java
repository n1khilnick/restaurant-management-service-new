package com.geekster.restaurantmanagementservice.repositories;

import com.geekster.restaurantmanagementservice.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentDao extends JpaRepository<Student,Long> {
}
