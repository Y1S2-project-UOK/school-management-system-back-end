/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group11.schoolmanagementsystembackend.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ishan
 */
@Entity
@Table(name = "non_academic", catalog = "school_management_system", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NonAcademic.findAll", query = "SELECT n FROM NonAcademic n"),
    @NamedQuery(name = "NonAcademic.findByNonAcademicRegNo", query = "SELECT n FROM NonAcademic n WHERE n.nonAcademicRegNo = :nonAcademicRegNo")})
public class NonAcademic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "non_academic_reg_no")
    private String nonAcademicRegNo;
    @JoinColumn(name = "non_academic_reg_no", referencedColumnName = "staff_reg_no", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Staff staff;

    public NonAcademic() {
    }

    public NonAcademic(String nonAcademicRegNo) {
        this.nonAcademicRegNo = nonAcademicRegNo;
    }

    public String getNonAcademicRegNo() {
        return nonAcademicRegNo;
    }

    public void setNonAcademicRegNo(String nonAcademicRegNo) {
        this.nonAcademicRegNo = nonAcademicRegNo;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nonAcademicRegNo != null ? nonAcademicRegNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NonAcademic)) {
            return false;
        }
        NonAcademic other = (NonAcademic) object;
        if ((this.nonAcademicRegNo == null && other.nonAcademicRegNo != null) || (this.nonAcademicRegNo != null && !this.nonAcademicRegNo.equals(other.nonAcademicRegNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.group11.schoolmanagementsystembackend.entity.NonAcademic[ nonAcademicRegNo=" + nonAcademicRegNo + " ]";
    }
    
}
