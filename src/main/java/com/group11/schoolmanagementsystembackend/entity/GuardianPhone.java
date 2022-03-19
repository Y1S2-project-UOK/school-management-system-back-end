/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group11.schoolmanagementsystembackend.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ishan
 */
@Entity
@Table(name = "guardian_phone", catalog = "school_management_system", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GuardianPhone.findAll", query = "SELECT g FROM GuardianPhone g"),
    @NamedQuery(name = "GuardianPhone.findByGuardianId", query = "SELECT g FROM GuardianPhone g WHERE g.guardianPhonePK.guardianId = :guardianId"),
    @NamedQuery(name = "GuardianPhone.findByGuardianPhoneNo", query = "SELECT g FROM GuardianPhone g WHERE g.guardianPhonePK.guardianPhoneNo = :guardianPhoneNo")})
public class GuardianPhone implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GuardianPhonePK guardianPhonePK;
    @JoinColumn(name = "guardian_id", referencedColumnName = "guardian_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Guardian guardian;

    public GuardianPhone() {
    }

    public GuardianPhone(GuardianPhonePK guardianPhonePK) {
        this.guardianPhonePK = guardianPhonePK;
    }

    public GuardianPhone(String guardianId, String guardianPhoneNo) {
        this.guardianPhonePK = new GuardianPhonePK(guardianId, guardianPhoneNo);
    }

    public GuardianPhonePK getGuardianPhonePK() {
        return guardianPhonePK;
    }

    public void setGuardianPhonePK(GuardianPhonePK guardianPhonePK) {
        this.guardianPhonePK = guardianPhonePK;
    }

    public Guardian getGuardian() {
        return guardian;
    }

    public void setGuardian(Guardian guardian) {
        this.guardian = guardian;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (guardianPhonePK != null ? guardianPhonePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GuardianPhone)) {
            return false;
        }
        GuardianPhone other = (GuardianPhone) object;
        if ((this.guardianPhonePK == null && other.guardianPhonePK != null) || (this.guardianPhonePK != null && !this.guardianPhonePK.equals(other.guardianPhonePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.group11.schoolmanagementsystembackend.entity.GuardianPhone[ guardianPhonePK=" + guardianPhonePK + " ]";
    }
    
}
