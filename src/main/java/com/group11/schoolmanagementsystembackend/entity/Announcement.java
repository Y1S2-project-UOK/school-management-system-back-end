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
@Table(name = "announcement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Announcement.findAll", query = "SELECT a FROM Announcement a"),
    @NamedQuery(name = "Announcement.findByAnnouncementid", query = "SELECT a FROM Announcement a WHERE a.announcementid = :announcementid"),
    @NamedQuery(name = "Announcement.findByTitle", query = "SELECT a FROM Announcement a WHERE a.title = :title"),
    @NamedQuery(name = "Announcement.findByDetails", query = "SELECT a FROM Announcement a WHERE a.details = :details"),
    @NamedQuery(name = "Announcement.findByPublisherName", query = "SELECT a FROM Announcement a WHERE a.publisherName = :publisherName"),
    @NamedQuery(name = "Announcement.findByPublishDate", query = "SELECT a FROM Announcement a WHERE a.publishDate = :publishDate")})
public class Announcement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "announcementid")
    private String announcementid;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @Column(name = "details")
    private String details;
    @Basic(optional = false)
    @Column(name = "publisher_name")
    private String publisherName;
    @Basic(optional = false)
    @Column(name = "publish_date")
    @Temporal(TemporalType.DATE)
    private Date publishDate;

    public Announcement() {
    }

    public Announcement(String announcementid) {
        this.announcementid = announcementid;
    }

    public Announcement(String announcementid, String title, String details, String publisherName, Date publishDate) {
        this.announcementid = announcementid;
        this.title = title;
        this.details = details;
        this.publisherName = publisherName;
        this.publishDate = publishDate;
    }

    public String getAnnouncementid() {
        return announcementid;
    }

    public void setAnnouncementid(String announcementid) {
        this.announcementid = announcementid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (announcementid != null ? announcementid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Announcement)) {
            return false;
        }
        Announcement other = (Announcement) object;
        if ((this.announcementid == null && other.announcementid != null) || (this.announcementid != null && !this.announcementid.equals(other.announcementid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.group11.schoolmanagementsystembackend.entity.Announcement[ announcementid=" + announcementid + " ]";
    }
    
}
