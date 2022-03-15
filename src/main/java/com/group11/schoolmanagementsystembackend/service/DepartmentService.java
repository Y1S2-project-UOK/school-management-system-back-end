package com.group11.schoolmanagementsystembackend.service;

import java.util.List;

import com.group11.schoolmanagementsystembackend.entity.Department;

public interface DepartmentService {

   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentsList();

}
