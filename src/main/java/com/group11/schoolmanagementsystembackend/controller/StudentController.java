package com.group11.schoolmanagementsystembackend.controller;

import com.group11.schoolmanagementsystembackend.entity.Student;
import com.group11.schoolmanagementsystembackend.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/verify-student")
    public Student fetchAnnouncementById(@RequestBody Student student){
        return studentService.fetchStudentByAdmissionNoAndPassword(student.getStudentAdmissionNo(),student.getStudentPassword());
    }
    
}
