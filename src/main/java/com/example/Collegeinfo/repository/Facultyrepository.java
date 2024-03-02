package com.example.Collegeinfo.repository;

import com.example.Collegeinfo.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Facultyrepository extends JpaRepository<Faculty,Integer> {
    List<Faculty> findAllByCollegeId(int collegeId);
}
