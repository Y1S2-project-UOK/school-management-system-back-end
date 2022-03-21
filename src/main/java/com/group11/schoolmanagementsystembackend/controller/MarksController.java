package com.group11.schoolmanagementsystembackend.controller;

import java.util.List;

import com.group11.schoolmanagementsystembackend.entity.Marks;
import com.group11.schoolmanagementsystembackend.service.MarksService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarksController {

    @Autowired
    private MarksService marksService;

    @GetMapping("/marks")
    public List<Marks> fetchMarks() {
        return marksService.fetchMarks();
    }
}
