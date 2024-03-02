package com.example.Collegeinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "college")
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
public int id;
public String name;
public String location;
public String websiteUrl;
@OneToMany(mappedBy = "college",cascade = CascadeType.ALL)
    private List<Department> department;
@OneToMany(mappedBy = "college",cascade = CascadeType.ALL)
    private List<Faculty> faculty;

}
