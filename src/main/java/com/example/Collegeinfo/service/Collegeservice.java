package com.example.Collegeinfo.service;

import com.example.Collegeinfo.model.College;
import com.example.Collegeinfo.repository.Collegerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Collegeservice {
    @Autowired
    private Collegerepository repo;

    public List<College> addcolleges(List<College> colleges)
    {
        return repo.saveAll(colleges);
    }
    public List<College> getColleges()
    {
        return repo.findAll();
    }
    public College getCollegeById(int id)
    {
        return repo.findById(id).orElse(null);
    }
   public College updatecollege(int id, College updatedCollege)
   {
       Optional<College> optionalCollege = repo.findById(id);
       if (optionalCollege.isPresent())
       {
           College existingCollege = optionalCollege.get();
           existingCollege.setName(updatedCollege.getName());
           return repo.save(existingCollege);
       }
       else{
           throw new RuntimeException("College not found with id: " + id);
       }
   }
   public String deletecollege(int id)
   {
       repo.deleteById(id);
       return "college data is deleted with " + id;
   }
}