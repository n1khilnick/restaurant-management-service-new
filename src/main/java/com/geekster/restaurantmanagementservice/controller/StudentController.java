package com.geekster.restaurantmanagementservice.controller;

import com.geekster.restaurantmanagementservice.model.Student;
import com.geekster.restaurantmanagementservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    @Autowired
    StudentService studentService;


    @PostMapping("/save")
    public String addStudent(@RequestBody Student student){
       return studentService.addStudent(student);
    }

    @GetMapping("/get")
    public List<Student> getStudent(){
        return studentService.getALlStudents();
    }
}
