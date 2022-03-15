package com.group11.schoolmanagementsystembackend.controller;

import com.group11.schoolmanagementsystembackend.entity.Student;
import com.group11.schoolmanagementsystembackend.service.StudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private StudentService studentService;

    @GetMapping("/students/{studentAdmissionNo}")
    public Student fetchStudentByAdmissionNo(@PathVariable("studentAdmissionNo") String studentAdmissionNo) {
        return studentService.fetchStudentByAdmissionNo(studentAdmissionNo);
    }
}
