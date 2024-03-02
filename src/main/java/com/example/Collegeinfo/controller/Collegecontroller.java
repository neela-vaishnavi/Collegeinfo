package com.example.Collegeinfo.controller;

import com.example.Collegeinfo.model.College;
import com.example.Collegeinfo.service.Collegeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/colleges")
public class Collegecontroller{
    @Autowired
    private Collegeservice collegeservice;
    @PostMapping("/addcolleges")
    public List<College> addColleges(@RequestBody List<College> colleges)
    {
        return collegeservice.addcolleges(colleges);
    }
    @GetMapping("/all")
    public List<College> getColleges(){
        return collegeservice.getColleges();
    }
    @GetMapping("/{id}")
    public College getCollegeById(@PathVariable int id)
    {
        return collegeservice.getCollegeById(id);
    }
    @PutMapping("/college/{id}")
    public College updatecollege(@PathVariable int id,@RequestBody College college)
    {
        return collegeservice.updatecollege(id, college);
    }
    @DeleteMapping("/colleges/{id}")
    public String deletecollege(@PathVariable int id)
    {
        return collegeservice.deletecollege(id);
    }
}
