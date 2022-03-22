package com.group11.schoolmanagementsystembackend.service;

import com.group11.schoolmanagementsystembackend.entity.Student;

public interface StudentService {
    public Student fetchStudentByAdmissionNoAndPassword(String admissionNo,String studentPassword);
}
