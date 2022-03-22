package com.group11.schoolmanagementsystembackend.controller;

import com.group11.schoolmanagementsystembackend.entity.Marks;
import com.group11.schoolmanagementsystembackend.service.MarksService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarksController {

    @Autowired
    private MarksService marksService;

    @GetMapping("/marks/student-admission-no/{student_admission_no}")
    public Marks fetchMarksByAdmissionNo(@PathVariable("student_admission_no") String AdmissionNo){
        return marksService.fetchMarksByAdmissionNo(AdmissionNo);
    }
}
