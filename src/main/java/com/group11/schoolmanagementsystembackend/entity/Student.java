package com.group11.schoolmanagementsystembackend.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="student")
public class Student {
    @Id
    @Column(name="student_admission_no")
    private String studentAdmissionNo;
    @Column(name="gender")
    private String gender;
    @Column(name="student_address")
    private String studentAddress;
    @Column(name="student_date_of_birth")
    private Date studentDateOfBirth;
    @Column(name="student_email")
    private String studentEmail;
    @Column(name="student_name")
    private String studentName;
    @Column(name="student_nationality")
    private String studentNationality;
    @Column(name="student_password")
    private String studentPassword;
    @Column(name="student_religion")
    private String studentReligion;
    @Column(name="guardian_id")
    private int guardianId;
}
