package com.group11.schoolmanagementsystembackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.group11.schoolmanagementsystembackend.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,String>{
    
}
