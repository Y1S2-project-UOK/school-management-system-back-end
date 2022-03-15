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
@Table(name = "guardian")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Guardian.findAll", query = "SELECT g FROM Guardian g"),
    @NamedQuery(name = "Guardian.findByGuardianID", query = "SELECT g FROM Guardian g WHERE g.guardianID = :guardianID"),
    @NamedQuery(name = "Guardian.findByGuardianName", query = "SELECT g FROM Guardian g WHERE g.guardianName = :guardianName"),
    @NamedQuery(name = "Guardian.findByGuardianPhoneNo", query = "SELECT g FROM Guardian g WHERE g.guardianPhoneNo = :guardianPhoneNo"),
    @NamedQuery(name = "Guardian.findByGuardianPassword", query = "SELECT g FROM Guardian g WHERE g.guardianPassword = :guardianPassword")})
public class Guardian implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "guardianID")
    private String guardianID;
    @Column(name = "guardianName")
    private String guardianName;
    @Column(name = "guardianPhoneNo")
    private String guardianPhoneNo;
    @Column(name = "guardianPassword")
    private String guardianPassword;
    @OneToMany(mappedBy = "guardianID")
    private List<Student> studentList;

    public Guardian() {
    }

    public Guardian(String guardianID) {
        this.guardianID = guardianID;
    }

    public String getGuardianID() {
        return guardianID;
    }

    public void setGuardianID(String guardianID) {
        this.guardianID = guardianID;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianPhoneNo() {
        return guardianPhoneNo;
    }

    public void setGuardianPhoneNo(String guardianPhoneNo) {
        this.guardianPhoneNo = guardianPhoneNo;
    }

    public String getGuardianPassword() {
        return guardianPassword;
    }

    public void setGuardianPassword(String guardianPassword) {
        this.guardianPassword = guardianPassword;
    }

    @XmlTransient
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (guardianID != null ? guardianID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guardian)) {
            return false;
        }
        Guardian other = (Guardian) object;
        if ((this.guardianID == null && other.guardianID != null) || (this.guardianID != null && !this.guardianID.equals(other.guardianID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.group11.schoolmanagementsystembackend.entity.Guardian[ guardianID=" + guardianID + " ]";
    }
    
}
