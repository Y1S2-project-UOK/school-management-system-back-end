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
public class GuardianPhonePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "guardian_id")
    private String guardianId;
    @Basic(optional = false)
    @Column(name = "guardian_phone_no")
    private String guardianPhoneNo;

    public GuardianPhonePK() {
    }

    public GuardianPhonePK(String guardianId, String guardianPhoneNo) {
        this.guardianId = guardianId;
        this.guardianPhoneNo = guardianPhoneNo;
    }

    public String getGuardianId() {
        return guardianId;
    }

    public void setGuardianId(String guardianId) {
        this.guardianId = guardianId;
    }

    public String getGuardianPhoneNo() {
        return guardianPhoneNo;
    }

    public void setGuardianPhoneNo(String guardianPhoneNo) {
        this.guardianPhoneNo = guardianPhoneNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (guardianId != null ? guardianId.hashCode() : 0);
        hash += (guardianPhoneNo != null ? guardianPhoneNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GuardianPhonePK)) {
            return false;
        }
        GuardianPhonePK other = (GuardianPhonePK) object;
        if ((this.guardianId == null && other.guardianId != null) || (this.guardianId != null && !this.guardianId.equals(other.guardianId))) {
            return false;
        }
        if ((this.guardianPhoneNo == null && other.guardianPhoneNo != null) || (this.guardianPhoneNo != null && !this.guardianPhoneNo.equals(other.guardianPhoneNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.group11.schoolmanagementsystembackend.entity.GuardianPhonePK[ guardianId=" + guardianId + ", guardianPhoneNo=" + guardianPhoneNo + " ]";
    }
    
}
