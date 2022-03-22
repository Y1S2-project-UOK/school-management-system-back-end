package com.group11.schoolmanagementsystembackend.repository;

import com.group11.schoolmanagementsystembackend.entity.Marks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MarksRepository extends JpaRepository<Marks,Integer>{
    public Marks findByStudentAdmissionNo(String admissionNo);
}
