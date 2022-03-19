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
@Table(name = "staff_leave", catalog = "school_management_system", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StaffLeave.findAll", query = "SELECT s FROM StaffLeave s"),
    @NamedQuery(name = "StaffLeave.findByLeaveId", query = "SELECT s FROM StaffLeave s WHERE s.leaveId = :leaveId"),
    @NamedQuery(name = "StaffLeave.findByLeaveEndDate", query = "SELECT s FROM StaffLeave s WHERE s.leaveEndDate = :leaveEndDate"),
    @NamedQuery(name = "StaffLeave.findByLeaveStartDate", query = "SELECT s FROM StaffLeave s WHERE s.leaveStartDate = :leaveStartDate"),
    @NamedQuery(name = "StaffLeave.findByLeaveType", query = "SELECT s FROM StaffLeave s WHERE s.leaveType = :leaveType"),
    @NamedQuery(name = "StaffLeave.findByReason", query = "SELECT s FROM StaffLeave s WHERE s.reason = :reason")})
public class StaffLeave implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "leave_id")
    private Integer leaveId;
    @Column(name = "leave_end_date")
    @Temporal(TemporalType.DATE)
    private Date leaveEndDate;
    @Column(name = "leave_start_date")
    @Temporal(TemporalType.DATE)
    private Date leaveStartDate;
    @Column(name = "leave_type")
    private String leaveType;
    @Column(name = "reason")
    private String reason;
    @JoinColumn(name = "staff_reg_no", referencedColumnName = "staff_reg_no")
    @ManyToOne
    private Staff staffRegNo;

    public StaffLeave() {
    }

    public StaffLeave(Integer leaveId) {
        this.leaveId = leaveId;
    }

    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    public Date getLeaveEndDate() {
        return leaveEndDate;
    }

    public void setLeaveEndDate(Date leaveEndDate) {
        this.leaveEndDate = leaveEndDate;
    }

    public Date getLeaveStartDate() {
        return leaveStartDate;
    }

    public void setLeaveStartDate(Date leaveStartDate) {
        this.leaveStartDate = leaveStartDate;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Staff getStaffRegNo() {
        return staffRegNo;
    }

    public void setStaffRegNo(Staff staffRegNo) {
        this.staffRegNo = staffRegNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (leaveId != null ? leaveId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StaffLeave)) {
            return false;
        }
        StaffLeave other = (StaffLeave) object;
        if ((this.leaveId == null && other.leaveId != null) || (this.leaveId != null && !this.leaveId.equals(other.leaveId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.group11.schoolmanagementsystembackend.entity.StaffLeave[ leaveId=" + leaveId + " ]";
    }
    
}
