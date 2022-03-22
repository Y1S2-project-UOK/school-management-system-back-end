package com.group11.schoolmanagementsystembackend.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="staff_leave")
public class StaffLeave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="leave_id")
    private int leaveId;
    @Column(name="leave_end_date")
    private Date leaveEndDate;
    @Column(name="leave_start_date")
    private Date leaveStartDate;
    @Column(name="leave_type")
    private String leaveType;
    @Column(name="reason")
    private String reason;
    @Column(name="unacademic_staff_reg_no")
    private String unacademicStaffRegNo;
    @Column(name="teacher_reg_no")
    private String teacherRegNo;
}
