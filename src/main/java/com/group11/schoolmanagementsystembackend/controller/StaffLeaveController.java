package com.group11.schoolmanagementsystembackend.controller;

import com.group11.schoolmanagementsystembackend.entity.StaffLeave;
import com.group11.schoolmanagementsystembackend.service.StaffLeaveService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffLeaveController {
    
    @Autowired
    private StaffLeaveService staffLeaveService;

    @PostMapping("/staff-leave-save")
    public StaffLeave saveStaffLeave(@RequestBody StaffLeave staffLeave){
        return staffLeaveService.saveStaffLeave(staffLeave);
    }
}
