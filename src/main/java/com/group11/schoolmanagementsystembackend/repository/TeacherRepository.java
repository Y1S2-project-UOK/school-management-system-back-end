package com.group11.schoolmanagementsystembackend.repository;

import com.group11.schoolmanagementsystembackend.entity.Teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,String>{
    public Teacher findByTeacherRegNoAndTeacherPassword(String teacherRegNo,String teacherPassword);
}
