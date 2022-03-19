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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ishan
 */
@Entity
@Table(name = "system_users", catalog = "school_management_system", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SystemUsers.findAll", query = "SELECT s FROM SystemUsers s"),
    @NamedQuery(name = "SystemUsers.findByEmail", query = "SELECT s FROM SystemUsers s WHERE s.email = :email"),
    @NamedQuery(name = "SystemUsers.findByAproveStatus", query = "SELECT s FROM SystemUsers s WHERE s.aproveStatus = :aproveStatus"),
    @NamedQuery(name = "SystemUsers.findByContactNo", query = "SELECT s FROM SystemUsers s WHERE s.contactNo = :contactNo"),
    @NamedQuery(name = "SystemUsers.findByFullName", query = "SELECT s FROM SystemUsers s WHERE s.fullName = :fullName"),
    @NamedQuery(name = "SystemUsers.findByLoginPassword", query = "SELECT s FROM SystemUsers s WHERE s.loginPassword = :loginPassword"),
    @NamedQuery(name = "SystemUsers.findByPosition", query = "SELECT s FROM SystemUsers s WHERE s.position = :position"),
    @NamedQuery(name = "SystemUsers.findByReasonToJoin", query = "SELECT s FROM SystemUsers s WHERE s.reasonToJoin = :reasonToJoin")})
public class SystemUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Column(name = "aprove_status")
    private Integer aproveStatus;
    @Basic(optional = false)
    @Column(name = "contact_no")
    private String contactNo;
    @Basic(optional = false)
    @Column(name = "full_name")
    private String fullName;
    @Basic(optional = false)
    @Column(name = "login_password")
    private String loginPassword;
    @Basic(optional = false)
    @Column(name = "position")
    private String position;
    @Basic(optional = false)
    @Column(name = "reason_to_join")
    private String reasonToJoin;

    public SystemUsers() {
    }

    public SystemUsers(String email) {
        this.email = email;
    }

    public SystemUsers(String email, String contactNo, String fullName, String loginPassword, String position, String reasonToJoin) {
        this.email = email;
        this.contactNo = contactNo;
        this.fullName = fullName;
        this.loginPassword = loginPassword;
        this.position = position;
        this.reasonToJoin = reasonToJoin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAproveStatus() {
        return aproveStatus;
    }

    public void setAproveStatus(Integer aproveStatus) {
        this.aproveStatus = aproveStatus;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getReasonToJoin() {
        return reasonToJoin;
    }

    public void setReasonToJoin(String reasonToJoin) {
        this.reasonToJoin = reasonToJoin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SystemUsers)) {
            return false;
        }
        SystemUsers other = (SystemUsers) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.group11.schoolmanagementsystembackend.entity.SystemUsers[ email=" + email + " ]";
    }
    
}
