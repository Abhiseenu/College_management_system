package com.college.college.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.college.Entity.Course;
import com.college.college.Repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepo;
    
    public Course createCourse(Course course) {
        return courseRepo.save(course);
    }
    
    public Course getCourse(Long id) {
        return courseRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Course not found"));
    }
    
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }
    
    public Course updateCourse(Long id, Course updatedCourse) {
        Course existing = getCourse(id);
        existing.setCoursename(updatedCourse.getCoursename());
        existing.setCredits(updatedCourse.getCredits());
        existing.setSemester(updatedCourse.getSemester());
        existing.setDepartment(updatedCourse.getDepartment());
        // If you update faculty association:
       // existing.setFaculty(updatedCourse.getFaculty());
        return courseRepo.save(existing);
    }
    
    public void deleteCourse(Long id) {
        courseRepo.deleteById(id);
    }
}
