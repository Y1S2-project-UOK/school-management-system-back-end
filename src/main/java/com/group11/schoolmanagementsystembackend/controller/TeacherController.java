package com.group11.schoolmanagementsystembackend.controller;

import com.group11.schoolmanagementsystembackend.entity.Teacher;
import com.group11.schoolmanagementsystembackend.service.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/verify-teacher")
    public Teacher fetchTeacherByRegNoAndPassword(@RequestBody Teacher teacher){
        return teacherService.fetchTeacherByRegNoAndPassword(teacher.getTeacherRegNo(), teacher.getTeacherPassword());
    }
}
