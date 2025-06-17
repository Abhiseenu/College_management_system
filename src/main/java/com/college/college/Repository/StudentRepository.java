package com.college.college.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.college.Entity.Student;
@Repository
public interface StudentRepository extends JpaRepository< Student,Long> {

    
    
}
