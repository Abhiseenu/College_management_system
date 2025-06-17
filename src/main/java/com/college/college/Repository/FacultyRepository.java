package com.college.college.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.college.Entity.Faculty;

public interface FacultyRepository extends JpaRepository< Faculty,Long>{
    
}
