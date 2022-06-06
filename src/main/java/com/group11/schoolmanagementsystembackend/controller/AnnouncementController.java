package com.group11.schoolmanagementsystembackend.controller;

import com.group11.schoolmanagementsystembackend.service.AnnouncementService;

import java.util.List;

import com.group11.schoolmanagementsystembackend.entity.Announcement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;

    @GetMapping("/announcement")
    public List<Announcement> fetchAnnouncements() {
        return announcementService.fetchAnnouncements();
    }

    @GetMapping("/announcement/{id}")
    public Announcement fetchAnnouncementById(@PathVariable("id") Integer announcementId){
        return announcementService.fetchAnnouncementById(announcementId);
    }
 
}
