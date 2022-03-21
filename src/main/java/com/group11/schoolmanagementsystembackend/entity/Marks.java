package com.group11.schoolmanagementsystembackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
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

    public Marks(int marksID, String examCode, String studentAdmissionNo, String subjectCode, float marks) {
        this.marksID = marksID;
        this.examCode = examCode;
        this.studentAdmissionNo = studentAdmissionNo;
        this.subjectCode = subjectCode;
        this.marks = marks;
    }

    public Marks() {
    }

    public int getMarksID() {
        return marksID;
    }

    public void setMarksID(int marksID) {
        this.marksID = marksID;
    }

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    public String getStudentAdmissionNo() {
        return studentAdmissionNo;
    }

    public void setStudentAdmissionNo(String studentAdmissionNo) {
        this.studentAdmissionNo = studentAdmissionNo;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    

    

    

    
}
