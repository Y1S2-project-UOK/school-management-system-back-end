/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group11.schoolmanagementsystembackend.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ishan
 */
@Entity
@Table(name = "guardian", catalog = "school_management_system", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Guardian.findAll", query = "SELECT g FROM Guardian g"),
    @NamedQuery(name = "Guardian.findByGuardianId", query = "SELECT g FROM Guardian g WHERE g.guardianId = :guardianId"),
    @NamedQuery(name = "Guardian.findByGuardianName", query = "SELECT g FROM Guardian g WHERE g.guardianName = :guardianName"),
    @NamedQuery(name = "Guardian.findByGuardianPassword", query = "SELECT g FROM Guardian g WHERE g.guardianPassword = :guardianPassword"),
    @NamedQuery(name = "Guardian.findByGuardianPhoneNo", query = "SELECT g FROM Guardian g WHERE g.guardianPhoneNo = :guardianPhoneNo")})
public class Guardian implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "guardian_id")
    private String guardianId;
    @Column(name = "guardian_name")
    private String guardianName;
    @Column(name = "guardian_password")
    private String guardianPassword;
    @Column(name = "guardian_phone_no")
    private String guardianPhoneNo;
    @OneToMany(mappedBy = "guardianId")
    private List<Student> studentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "guardian")
    private List<GuardianPhone> guardianPhoneList;

    public Guardian() {
    }

    public Guardian(String guardianId) {
        this.guardianId = guardianId;
    }

    public String getGuardianId() {
        return guardianId;
    }

    public void setGuardianId(String guardianId) {
        this.guardianId = guardianId;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianPassword() {
        return guardianPassword;
    }

    public void setGuardianPassword(String guardianPassword) {
        this.guardianPassword = guardianPassword;
    }

    public String getGuardianPhoneNo() {
        return guardianPhoneNo;
    }

    public void setGuardianPhoneNo(String guardianPhoneNo) {
        this.guardianPhoneNo = guardianPhoneNo;
    }

    @XmlTransient
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @XmlTransient
    public List<GuardianPhone> getGuardianPhoneList() {
        return guardianPhoneList;
    }

    public void setGuardianPhoneList(List<GuardianPhone> guardianPhoneList) {
        this.guardianPhoneList = guardianPhoneList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (guardianId != null ? guardianId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guardian)) {
            return false;
        }
        Guardian other = (Guardian) object;
        if ((this.guardianId == null && other.guardianId != null) || (this.guardianId != null && !this.guardianId.equals(other.guardianId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.group11.schoolmanagementsystembackend.entity.Guardian[ guardianId=" + guardianId + " ]";
    }
    
}
