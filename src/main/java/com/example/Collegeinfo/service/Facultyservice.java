package com.example.Collegeinfo.service;

import com.example.Collegeinfo.model.Faculty;
import com.example.Collegeinfo.repository.Facultyrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facultyservice {
    @Autowired
    public Facultyrepository repo;
    public Faculty addFacultyToCollege(Faculty faculty)
    {
        return repo.save(faculty);
    }
    public List<Faculty> getAllFacultiesByCollegeId(int collegeId)
    {
        return repo.findAllByCollegeId(collegeId);
    }
}
