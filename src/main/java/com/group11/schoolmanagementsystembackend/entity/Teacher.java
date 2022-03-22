package com.group11.schoolmanagementsystembackend.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="teacher")
public class Teacher {
    @Id
    @Column(name="teacher_reg_no")
    private String teacherRegNo;
    @Column(name="teacher_basic_salary")
    private float teacherBasicSalary;
    @Column(name="teacher_date_of_birth")
    private Date teacherDateOfBirth;
    @Column(name="teacher_email")
    private String teacherEmail;
    @Column(name="teacher_gender")
    private String teacherGender;
    @Column(name="teacher_nic")
    private String teacherNic;
    @Column(name="teacher_name")
    private String teacherName;
    @Column(name="teacher_nationality")
    private String teacherNationality;
    @Column(name="teacher_password")
    private String teacherPassword;
    @Column(name="teacher_religion")
    private String teacherReligion;
        
}
