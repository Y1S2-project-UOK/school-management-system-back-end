package com.group11.schoolmanagementsystembackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "marks")
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "marks_id")
    private int marksID;
    @Column(name = "exam_code")
    private String examCode;
    @Column(name = "student_admission_no")
    private String studentAdmissionNo;
    @Column(name = "subject_code")
    private String subjectCode;
    @Column(name = "marks")
    private float marks;
}
