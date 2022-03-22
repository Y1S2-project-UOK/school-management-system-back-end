package com.group11.schoolmanagementsystembackend.repository;

import com.group11.schoolmanagementsystembackend.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,String>{
    public Student findByStudentAdmissionNoAndStudentPassword(String admissionNo,String studentPassword);
}
