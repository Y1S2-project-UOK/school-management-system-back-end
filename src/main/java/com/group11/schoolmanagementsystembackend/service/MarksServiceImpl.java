package com.group11.schoolmanagementsystembackend.service;

import java.util.List;

import com.group11.schoolmanagementsystembackend.entity.Marks;
import com.group11.schoolmanagementsystembackend.repository.MarksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarksServiceImpl implements MarksService{

    @Autowired
    private MarksRepository marksRepository;

    @Override
    public List<Marks> fetchMarks() {
        return marksRepository.findAll();
    }
    
}
