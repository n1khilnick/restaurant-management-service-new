package com.geekster.restaurantmanagementservice.service;

import com.geekster.restaurantmanagementservice.model.Student;
import com.geekster.restaurantmanagementservice.repositories.IStudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentDao studentDao;

    public String addStudent(Student student) {
        studentDao.save(student);
        return "Student Added";
    }

    public List<Student> getALlStudents() {
        return studentDao.findAll();
    }
}
