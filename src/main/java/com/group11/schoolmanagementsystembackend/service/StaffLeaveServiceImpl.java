package com.group11.schoolmanagementsystembackend.service;

import com.group11.schoolmanagementsystembackend.entity.StaffLeave;
import com.group11.schoolmanagementsystembackend.repository.StaffLeaveRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffLeaveServiceImpl implements StaffLeaveService{

    @Autowired
    private StaffLeaveRepository staffLeaveRepository;

    @Override
    public StaffLeave saveStaffLeave(StaffLeave staffLeave) {
        return staffLeaveRepository.save(staffLeave);
    }
    
}
