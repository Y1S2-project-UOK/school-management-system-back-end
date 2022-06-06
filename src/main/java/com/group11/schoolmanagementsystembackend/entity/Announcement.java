/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group11.schoolmanagementsystembackend.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 *
 * @author ishan
 */
@Entity
@Data
@Table(name = "announcement")
public class Announcement{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "announcement_id")
    private Integer announcementId;
    @Column(name = "description")
    private String description;
    @Column(name = "publish_date")
    private Date publishDate;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "venue")
    private String venue;
    @Column(name = "title")
    private String title;
}
