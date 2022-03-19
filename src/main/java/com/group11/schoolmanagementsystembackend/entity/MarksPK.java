/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group11.schoolmanagementsystembackend.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author ishan
 */
@Embeddable
public class MarksPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "exam_code")
    private String examCode;
    @Basic(optional = false)
    @Column(name = "student_admission_no")
    private String studentAdmissionNo;
    @Basic(optional = false)
    @Column(name = "subject_code")
    private String subjectCode;

    public MarksPK() {
    }

    public MarksPK(String examCode, String studentAdmissionNo, String subjectCode) {
        this.examCode = examCode;
        this.studentAdmissionNo = studentAdmissionNo;
        this.subjectCode = subjectCode;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (examCode != null ? examCode.hashCode() : 0);
        hash += (studentAdmissionNo != null ? studentAdmissionNo.hashCode() : 0);
        hash += (subjectCode != null ? subjectCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MarksPK)) {
            return false;
        }
        MarksPK other = (MarksPK) object;
        if ((this.examCode == null && other.examCode != null) || (this.examCode != null && !this.examCode.equals(other.examCode))) {
            return false;
        }
        if ((this.studentAdmissionNo == null && other.studentAdmissionNo != null) || (this.studentAdmissionNo != null && !this.studentAdmissionNo.equals(other.studentAdmissionNo))) {
            return false;
        }
        if ((this.subjectCode == null && other.subjectCode != null) || (this.subjectCode != null && !this.subjectCode.equals(other.subjectCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.group11.schoolmanagementsystembackend.entity.MarksPK[ examCode=" + examCode + ", studentAdmissionNo=" + studentAdmissionNo + ", subjectCode=" + subjectCode + " ]";
    }
    
}
