package com.group11.schoolmanagementsystembackend.controller;

import com.group11.schoolmanagementsystembackend.service.AnnouncementService;

import java.util.List;

import com.group11.schoolmanagementsystembackend.entity.Announcement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
}
