package com.example.Collegeinfo.controller;

import com.example.Collegeinfo.model.College;
import com.example.Collegeinfo.model.Department;
import com.example.Collegeinfo.service.Departmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class Departmentcontroller {
    @Autowired
    private Departmentservice departmentservice;
    @PostMapping
    public Department adddepartment(@RequestBody Department department)
    {
        return departmentservice.adddepartment(department);
    }
    @GetMapping("get/{id}")
    public Department getdepartment(@PathVariable int id)
    {
        return departmentservice.getdepartment(id);
    }
}
