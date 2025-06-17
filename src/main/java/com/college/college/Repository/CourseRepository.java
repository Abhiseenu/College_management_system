package com.college.college.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.college.Entity.Course;

public interface CourseRepository extends JpaRepository< Course,Long> {
    
}
