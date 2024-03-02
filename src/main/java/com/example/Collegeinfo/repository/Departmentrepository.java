package com.example.Collegeinfo.repository;

import com.example.Collegeinfo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Departmentrepository extends JpaRepository<Department,Integer> {
}
