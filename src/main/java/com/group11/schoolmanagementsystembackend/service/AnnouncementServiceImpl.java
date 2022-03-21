package com.group11.schoolmanagementsystembackend.service;

import java.util.List;
import java.util.Objects;

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
    public Announcement saveAnnouncements(Announcement announcement) {
        return announcementRepository.save(announcement);
    }

    @Override
    public Announcement fetchAnnouncementById(Integer announcementId) {
        return announcementRepository.findById(announcementId).get();
    }

    @Override
    public void deleteAnnouncementById(Integer announcementId) {
        announcementRepository.deleteById(announcementId);
        
    }

    @Override
    public Announcement updateAnnouncement(Integer announcementId, Announcement announcement) {
        Announcement dbAnnouncement = announcementRepository.findById(announcementId).get();
        if(Objects.nonNull(announcement.getTitle())&&!"".equalsIgnoreCase(announcement.getTitle())){
            dbAnnouncement.setTitle(announcement.getTitle());
        }

        if(Objects.nonNull(announcement.getDetails())&&!"".equalsIgnoreCase(announcement.getDetails())){
            dbAnnouncement.setDetails(announcement.getTitle());
        }

        if(Objects.nonNull(announcement.getPublishDate())){
            dbAnnouncement.setAnnouncementId(announcementId);
        }

        if(Objects.nonNull(announcement.getPublisherName())&&!"".equalsIgnoreCase(announcement.getPublisherName())){
            dbAnnouncement.setPublisherName(announcement.getPublisherName());;
        }
        
        return announcementRepository.save(dbAnnouncement);
    }
    
}
