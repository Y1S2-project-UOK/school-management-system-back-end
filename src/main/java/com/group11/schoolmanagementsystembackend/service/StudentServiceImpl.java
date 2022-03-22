package com.group11.schoolmanagementsystembackend.service;

import com.group11.schoolmanagementsystembackend.entity.Student;
import com.group11.schoolmanagementsystembackend.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student fetchStudentByAdmissionNoAndPassword(String admissionNo, String studentPassword) {
        return studentRepository.findByStudentAdmissionNoAndStudentPassword(admissionNo, studentPassword);
    }
    
}
