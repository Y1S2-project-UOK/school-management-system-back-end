package com.group11.schoolmanagementsystembackend.service;

import java.util.List;

import com.group11.schoolmanagementsystembackend.entity.Announcement;

public interface AnnouncementService {

    public List<Announcement> fetchAnnouncements();
    public Announcement fetchAnnouncementById(Integer announcementId);

}
