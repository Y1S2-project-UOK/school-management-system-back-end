package com.group11.schoolmanagementsystembackend.repository;

import com.group11.schoolmanagementsystembackend.entity.Announcement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement,Integer>{
    
}
