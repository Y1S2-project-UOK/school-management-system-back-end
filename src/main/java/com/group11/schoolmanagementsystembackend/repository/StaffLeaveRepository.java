package com.group11.schoolmanagementsystembackend.repository;

import com.group11.schoolmanagementsystembackend.entity.StaffLeave;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffLeaveRepository extends JpaRepository<StaffLeave,Integer>{
    
}
