package com.group11.schoolmanagementsystembackend.service;

import java.util.List;

import com.group11.schoolmanagementsystembackend.entity.Announcement;

public interface AnnouncementService {
    public List<Announcement> fetchAnnouncements();

    public Announcement announcement(Announcement announcement);

    public Announcement fetchAnnouncementById(Integer announcementId);

    public void deleteAnnouncementById(Integer announcementId);

    public Announcement updateAnnouncement(Integer announcementId, Announcement announcement);
}
