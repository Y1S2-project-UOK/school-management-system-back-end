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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "staff", catalog = "school_management_system", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Staff.findAll", query = "SELECT s FROM Staff s"),
    @NamedQuery(name = "Staff.findByStaffRegNo", query = "SELECT s FROM Staff s WHERE s.staffRegNo = :staffRegNo"),
    @NamedQuery(name = "Staff.findByStaffBasicSalary", query = "SELECT s FROM Staff s WHERE s.staffBasicSalary = :staffBasicSalary"),
    @NamedQuery(name = "Staff.findByStaffDateOfBirth", query = "SELECT s FROM Staff s WHERE s.staffDateOfBirth = :staffDateOfBirth"),
    @NamedQuery(name = "Staff.findByStaffEmail", query = "SELECT s FROM Staff s WHERE s.staffEmail = :staffEmail"),
    @NamedQuery(name = "Staff.findByStaffGender", query = "SELECT s FROM Staff s WHERE s.staffGender = :staffGender"),
    @NamedQuery(name = "Staff.findByStaffNic", query = "SELECT s FROM Staff s WHERE s.staffNic = :staffNic"),
    @NamedQuery(name = "Staff.findByStaffName", query = "SELECT s FROM Staff s WHERE s.staffName = :staffName"),
    @NamedQuery(name = "Staff.findByStaffNationality", query = "SELECT s FROM Staff s WHERE s.staffNationality = :staffNationality"),
    @NamedQuery(name = "Staff.findByStaffPassword", query = "SELECT s FROM Staff s WHERE s.staffPassword = :staffPassword"),
    @NamedQuery(name = "Staff.findByStaffPosition", query = "SELECT s FROM Staff s WHERE s.staffPosition = :staffPosition"),
    @NamedQuery(name = "Staff.findByStaffReligion", query = "SELECT s FROM Staff s WHERE s.staffReligion = :staffReligion"),
    @NamedQuery(name = "Staff.findByStaffStatus", query = "SELECT s FROM Staff s WHERE s.staffStatus = :staffStatus")})
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "staff_reg_no")
    private String staffRegNo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "staff_basic_salary")
    private Float staffBasicSalary;
    @Column(name = "staff_date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date staffDateOfBirth;
    @Column(name = "staff_email")
    private String staffEmail;
    @Column(name = "staff_gender")
    private String staffGender;
    @Column(name = "staff_nic")
    private String staffNic;
    @Column(name = "staff_name")
    private String staffName;
    @Column(name = "staff_nationality")
    private String staffNationality;
    @Column(name = "staff_password")
    private String staffPassword;
    @Column(name = "staff_position")
    private String staffPosition;
    @Column(name = "staff_religion")
    private String staffReligion;
    @Column(name = "staff_status")
    private String staffStatus;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "staff")
    private Teacher teacher;
    @OneToMany(mappedBy = "staffRegNo")
    private List<StaffLeave> staffLeaveList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "staff")
    private NonAcademic nonAcademic;

    public Staff() {
    }

    public Staff(String staffRegNo) {
        this.staffRegNo = staffRegNo;
    }

    public String getStaffRegNo() {
        return staffRegNo;
    }

    public void setStaffRegNo(String staffRegNo) {
        this.staffRegNo = staffRegNo;
    }

    public Float getStaffBasicSalary() {
        return staffBasicSalary;
    }

    public void setStaffBasicSalary(Float staffBasicSalary) {
        this.staffBasicSalary = staffBasicSalary;
    }

    public Date getStaffDateOfBirth() {
        return staffDateOfBirth;
    }

    public void setStaffDateOfBirth(Date staffDateOfBirth) {
        this.staffDateOfBirth = staffDateOfBirth;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getStaffGender() {
        return staffGender;
    }

    public void setStaffGender(String staffGender) {
        this.staffGender = staffGender;
    }

    public String getStaffNic() {
        return staffNic;
    }

    public void setStaffNic(String staffNic) {
        this.staffNic = staffNic;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffNationality() {
        return staffNationality;
    }

    public void setStaffNationality(String staffNationality) {
        this.staffNationality = staffNationality;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    public String getStaffReligion() {
        return staffReligion;
    }

    public void setStaffReligion(String staffReligion) {
        this.staffReligion = staffReligion;
    }

    public String getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(String staffStatus) {
        this.staffStatus = staffStatus;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @XmlTransient
    public List<StaffLeave> getStaffLeaveList() {
        return staffLeaveList;
    }

    public void setStaffLeaveList(List<StaffLeave> staffLeaveList) {
        this.staffLeaveList = staffLeaveList;
    }

    public NonAcademic getNonAcademic() {
        return nonAcademic;
    }

    public void setNonAcademic(NonAcademic nonAcademic) {
        this.nonAcademic = nonAcademic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffRegNo != null ? staffRegNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.staffRegNo == null && other.staffRegNo != null) || (this.staffRegNo != null && !this.staffRegNo.equals(other.staffRegNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.group11.schoolmanagementsystembackend.entity.Staff[ staffRegNo=" + staffRegNo + " ]";
    }
    
}
