/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group11.schoolmanagementsystembackend.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ishan
 */
@Entity
@Table(name = "teacher", catalog = "school_management_system", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teacher.findAll", query = "SELECT t FROM Teacher t"),
    @NamedQuery(name = "Teacher.findByTeacherRegNo", query = "SELECT t FROM Teacher t WHERE t.teacherRegNo = :teacherRegNo")})
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "teacher_reg_no")
    private String teacherRegNo;
    @JoinTable(name = "teacher_subject", joinColumns = {
        @JoinColumn(name = "teacher_reg_no", referencedColumnName = "teacher_reg_no")}, inverseJoinColumns = {
        @JoinColumn(name = "subject_code", referencedColumnName = "subject_code")})
    @ManyToMany
    private List<Subjects> subjectsList;
    @JoinColumn(name = "teacher_reg_no", referencedColumnName = "staff_reg_no", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Staff staff;
    @OneToMany(mappedBy = "teacherRegNo")
    private List<Class> classList;

    public Teacher() {
    }

    public Teacher(String teacherRegNo) {
        this.teacherRegNo = teacherRegNo;
    }

    public String getTeacherRegNo() {
        return teacherRegNo;
    }

    public void setTeacherRegNo(String teacherRegNo) {
        this.teacherRegNo = teacherRegNo;
    }

    @XmlTransient
    public List<Subjects> getSubjectsList() {
        return subjectsList;
    }

    public void setSubjectsList(List<Subjects> subjectsList) {
        this.subjectsList = subjectsList;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @XmlTransient
    public List<Class> getClassList() {
        return classList;
    }

    public void setClassList(List<Class> classList) {
        this.classList = classList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teacherRegNo != null ? teacherRegNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teacher)) {
            return false;
        }
        Teacher other = (Teacher) object;
        if ((this.teacherRegNo == null && other.teacherRegNo != null) || (this.teacherRegNo != null && !this.teacherRegNo.equals(other.teacherRegNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.group11.schoolmanagementsystembackend.entity.Teacher[ teacherRegNo=" + teacherRegNo + " ]";
    }
    
}
