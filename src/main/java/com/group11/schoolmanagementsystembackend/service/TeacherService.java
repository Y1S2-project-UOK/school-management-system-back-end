package com.group11.schoolmanagementsystembackend.service;

import com.group11.schoolmanagementsystembackend.entity.Teacher;

public interface TeacherService {
    public Teacher fetchTeacherByRegNoAndPassword(String teacherRegNo,String teacherPassword);
}
