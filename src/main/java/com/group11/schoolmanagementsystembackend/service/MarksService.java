package com.group11.schoolmanagementsystembackend.service;

import java.util.List;

import com.group11.schoolmanagementsystembackend.entity.Marks;

public interface MarksService {
    public Marks fetchMarksByAdmissionNo(String admissionNo);
}
