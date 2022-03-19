package com.group11.schoolmanagementsystembackend.controller;

import com.group11.schoolmanagementsystembackend.service.AnnouncementService;

import java.util.List;

import com.group11.schoolmanagementsystembackend.entity.Announcement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;

    @GetMapping("/announcement")
    public List<Announcement> fetchDepartments() {
        return announcementService.fetchAnnouncements();
    }

    @PostMapping("/announcement")
    public Announcement saveDepartment(@RequestBody Announcement announcement) {
        return announcementService.announcement(announcement);
    }

    @GetMapping("/announcement/{id}")
    public Announcement fetchAnnouncementById(@PathVariable("id") Integer announcementId){
        return announcementService.fetchAnnouncementById(announcementId);
    }

    @DeleteMapping("/announcement/{id}")
    public String deleteAnnouncementById(@PathVariable("id") Integer announcementId) {
        announcementService.deleteAnnouncementById(announcementId);
        return "announcement delete successfully";
    }

    @PutMapping("/announcement/{id}")
    public Announcement updateAnnouncement(@PathVariable("id") Integer announcementId, @RequestBody Announcement announcement) {
        return announcementService.updateAnnouncement(announcementId,announcement);
    }
}
