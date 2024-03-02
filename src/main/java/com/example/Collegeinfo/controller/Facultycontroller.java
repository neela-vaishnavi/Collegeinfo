package com.example.Collegeinfo.controller;

import com.example.Collegeinfo.model.Faculty;
import com.example.Collegeinfo.service.Facultyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty")
public class Facultycontroller {
    @Autowired
    public Facultyservice facultyservice;
    @PostMapping("/{collegeId}/faculties")
    public Faculty addFacultyToCollege(@RequestBody Faculty faculty)
    {
        return facultyservice.addFacultyToCollege(faculty);
    }
    @GetMapping("/{collegeId}/faculties")
    public List<Faculty> getAllFacultiesByCollegeId(@PathVariable int collegeId)
    {
        return facultyservice.getAllFacultiesByCollegeId(collegeId);
    }
}
