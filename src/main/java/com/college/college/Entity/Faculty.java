package com.college.college.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Faculty {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long facultyId;


    private String name;
    private String email;
    private  String designation;
    private String department;
    public Faculty(Long facultyId, String name, String email, String designation, String department) {
        this.facultyId = facultyId;
        this.name = name;
        this.email = email;
        this.designation = designation;
        this.department = department;
    }
    public Long getFacultyId() {
        return facultyId;
    }
    public void setFacultyId(Long facultyId) {
        this.facultyId = facultyId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
}
