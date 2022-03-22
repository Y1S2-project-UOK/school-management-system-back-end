package com.group11.schoolmanagementsystembackend.service;

import java.util.List;

import com.group11.schoolmanagementsystembackend.entity.Announcement;
import com.group11.schoolmanagementsystembackend.repository.AnnouncementRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AnnouncementServiceImpl implements AnnouncementService{

    @Autowired
    private AnnouncementRepository announcementRepository;

    @Override
    public List<Announcement> fetchAnnouncements() {
        return announcementRepository.findAll();
    }

    @Override
    public Announcement fetchAnnouncementById(Integer announcementId) {
        return announcementRepository.findById(announcementId).get();
    }
   
}
