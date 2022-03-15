/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group11.schoolmanagementsystembackend.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ishan
 */
@Entity
@Table(name = "student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByStudentAdmissionNo", query = "SELECT s FROM Student s WHERE s.studentAdmissionNo = :studentAdmissionNo"),
    @NamedQuery(name = "Student.findByStudentName", query = "SELECT s FROM Student s WHERE s.studentName = :studentName"),
    @NamedQuery(name = "Student.findByStudentEmail", query = "SELECT s FROM Student s WHERE s.studentEmail = :studentEmail"),
    @NamedQuery(name = "Student.findByStudentPassword", query = "SELECT s FROM Student s WHERE s.studentPassword = :studentPassword"),
    @NamedQuery(name = "Student.findByGender", query = "SELECT s FROM Student s WHERE s.gender = :gender"),
    @NamedQuery(name = "Student.findByStudentAddress", query = "SELECT s FROM Student s WHERE s.studentAddress = :studentAddress"),
    @NamedQuery(name = "Student.findByStudentNationality", query = "SELECT s FROM Student s WHERE s.studentNationality = :studentNationality"),
    @NamedQuery(name = "Student.findByStudentReligion", query = "SELECT s FROM Student s WHERE s.studentReligion = :studentReligion"),
    @NamedQuery(name = "Student.findByStudentDateOfBirth", query = "SELECT s FROM Student s WHERE s.studentDateOfBirth = :studentDateOfBirth"),
    @NamedQuery(name = "Student.findByStudentClassName", query = "SELECT s FROM Student s WHERE s.studentClassName = :studentClassName")})
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "studentAdmissionNo")
    private String studentAdmissionNo;
    @Column(name = "studentName")
    private String studentName;
    @Column(name = "studentEmail")
    private String studentEmail;
    @Column(name = "studentPassword")
    private String studentPassword;
    @Column(name = "gender")
    private String gender;
    @Column(name = "studentAddress")
    private String studentAddress;
    @Column(name = "studentNationality")
    private String studentNationality;
    @Column(name = "studentReligion")
    private String studentReligion;
    @Column(name = "studentDateOfBirth")
    @Temporal(TemporalType.DATE)
    private Date studentDateOfBirth;
    @Column(name = "studentClassName")
    private String studentClassName;
    @JoinColumn(name = "guardianID", referencedColumnName = "guardianID")
    @ManyToOne
    private Guardian guardianID;

    public Student() {
    }

    public Student(String studentAdmissionNo) {
        this.studentAdmissionNo = studentAdmissionNo;
    }

    public String getStudentAdmissionNo() {
        return studentAdmissionNo;
    }

    public void setStudentAdmissionNo(String studentAdmissionNo) {
        this.studentAdmissionNo = studentAdmissionNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentNationality() {
        return studentNationality;
    }

    public void setStudentNationality(String studentNationality) {
        this.studentNationality = studentNationality;
    }

    public String getStudentReligion() {
        return studentReligion;
    }

    public void setStudentReligion(String studentReligion) {
        this.studentReligion = studentReligion;
    }

    public Date getStudentDateOfBirth() {
        return studentDateOfBirth;
    }

    public void setStudentDateOfBirth(Date studentDateOfBirth) {
        this.studentDateOfBirth = studentDateOfBirth;
    }

    public String getStudentClassName() {
        return studentClassName;
    }

    public void setStudentClassName(String studentClassName) {
        this.studentClassName = studentClassName;
    }

    public Guardian getGuardianID() {
        return guardianID;
    }

    public void setGuardianID(Guardian guardianID) {
        this.guardianID = guardianID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentAdmissionNo != null ? studentAdmissionNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.studentAdmissionNo == null && other.studentAdmissionNo != null) || (this.studentAdmissionNo != null && !this.studentAdmissionNo.equals(other.studentAdmissionNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.group11.schoolmanagementsystembackend.entity.Student[ studentAdmissionNo=" + studentAdmissionNo + " ]";
    }
    
}
