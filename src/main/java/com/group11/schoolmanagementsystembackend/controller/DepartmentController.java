package com.group11.schoolmanagementsystembackend.controller;

import java.util.List;

import com.group11.schoolmanagementsystembackend.entity.Department;
import com.group11.schoolmanagementsystembackend.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<Department> fetchDepartments() {
        return departmentService.fetchDepartmentsList();
    }
    
}
