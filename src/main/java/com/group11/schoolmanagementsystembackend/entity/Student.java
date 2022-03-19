/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group11.schoolmanagementsystembackend.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ishan
 */
@Entity
@Table(name = "student", catalog = "school_management_system", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByStudentAdmissionNo", query = "SELECT s FROM Student s WHERE s.studentAdmissionNo = :studentAdmissionNo"),
    @NamedQuery(name = "Student.findByGender", query = "SELECT s FROM Student s WHERE s.gender = :gender"),
    @NamedQuery(name = "Student.findByStudentAddress", query = "SELECT s FROM Student s WHERE s.studentAddress = :studentAddress"),
    @NamedQuery(name = "Student.findByStudentClassName", query = "SELECT s FROM Student s WHERE s.studentClassName = :studentClassName"),
    @NamedQuery(name = "Student.findByStudentDateOfBirth", query = "SELECT s FROM Student s WHERE s.studentDateOfBirth = :studentDateOfBirth"),
    @NamedQuery(name = "Student.findByStudentEmail", query = "SELECT s FROM Student s WHERE s.studentEmail = :studentEmail"),
    @NamedQuery(name = "Student.findByStudentName", query = "SELECT s FROM Student s WHERE s.studentName = :studentName"),
    @NamedQuery(name = "Student.findByStudentNationality", query = "SELECT s FROM Student s WHERE s.studentNationality = :studentNationality"),
    @NamedQuery(name = "Student.findByStudentPassword", query = "SELECT s FROM Student s WHERE s.studentPassword = :studentPassword"),
    @NamedQuery(name = "Student.findByStudentReligion", query = "SELECT s FROM Student s WHERE s.studentReligion = :studentReligion")})
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "student_admission_no")
    private String studentAdmissionNo;
    @Column(name = "gender")
    private String gender;
    @Column(name = "student_address")
    private String studentAddress;
    @Column(name = "student_class_name")
    private String studentClassName;
    @Column(name = "student_date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date studentDateOfBirth;
    @Column(name = "student_email")
    private String studentEmail;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "student_nationality")
    private String studentNationality;
    @Column(name = "student_password")
    private String studentPassword;
    @Column(name = "student_religion")
    private String studentReligion;
    @ManyToMany(mappedBy = "studentList")
    private List<Subjects> subjectsList;
    @JoinColumn(name = "guardian_id", referencedColumnName = "guardian_id")
    @ManyToOne
    private Guardian guardianId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<Marks> marksList;

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

    public String getStudentClassName() {
        return studentClassName;
    }

    public void setStudentClassName(String studentClassName) {
        this.studentClassName = studentClassName;
    }

    public Date getStudentDateOfBirth() {
        return studentDateOfBirth;
    }

    public void setStudentDateOfBirth(Date studentDateOfBirth) {
        this.studentDateOfBirth = studentDateOfBirth;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNationality() {
        return studentNationality;
    }

    public void setStudentNationality(String studentNationality) {
        this.studentNationality = studentNationality;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentReligion() {
        return studentReligion;
    }

    public void setStudentReligion(String studentReligion) {
        this.studentReligion = studentReligion;
    }

    @XmlTransient
    public List<Subjects> getSubjectsList() {
        return subjectsList;
    }

    public void setSubjectsList(List<Subjects> subjectsList) {
        this.subjectsList = subjectsList;
    }

    public Guardian getGuardianId() {
        return guardianId;
    }

    public void setGuardianId(Guardian guardianId) {
        this.guardianId = guardianId;
    }

    @XmlTransient
    public List<Marks> getMarksList() {
        return marksList;
    }

    public void setMarksList(List<Marks> marksList) {
        this.marksList = marksList;
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
