package com.college.college.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.college.Entity.Enrollment;

public interface EnrollmentRepository extends JpaRepository< Enrollment,Long> {
    
}
