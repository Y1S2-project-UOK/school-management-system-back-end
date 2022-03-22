package com.group11.schoolmanagementsystembackend.service;

import com.group11.schoolmanagementsystembackend.entity.Teacher;
import com.group11.schoolmanagementsystembackend.repository.TeacherRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Teacher fetchTeacherByRegNoAndPassword(String teacherRegNo, String teacherPassword) {
        return teacherRepository.findByTeacherRegNoAndTeacherPassword(teacherRegNo, teacherPassword);
    }
    
}
