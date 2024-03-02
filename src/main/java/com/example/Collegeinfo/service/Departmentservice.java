package com.example.Collegeinfo.service;

import com.example.Collegeinfo.model.Department;
import com.example.Collegeinfo.repository.Departmentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Departmentservice {
@Autowired
    private Departmentrepository repo;
public Department adddepartment(Department department)
{
    return repo.save(department);
}
public Department getdepartment(int id)
{
    return repo.findById(id).orElse(null);
}
}
