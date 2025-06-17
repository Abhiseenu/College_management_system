package com.college.college.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.college.Entity.Enrollment;
import com.college.college.Repository.EnrollmentRepository;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepo;
    
    public Enrollment createEnrollment(Enrollment enrollment) {
        return enrollmentRepo.save(enrollment);
    }
    
    public Enrollment getEnrollment(Long id) {
        return enrollmentRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Enrollment not found"));
    }
    
    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepo.findAll();
    }
    
    public Enrollment updateEnrollment(Long id, Enrollment updatedEnrollment) {
        Enrollment existing = getEnrollment(id);
        // Update fields as needed; for instance, enrollment date and grade.
        existing.setEnrollmentDate(updatedEnrollment.getEnrollmentDate());
        existing.setGrade(updatedEnrollment.getGrade());
        // Optionally update associated student and course
        existing.setStudent(updatedEnrollment.getStudent());
        existing.setCourse(updatedEnrollment.getCourse());
        return enrollmentRepo.save(existing);
    }
    
    public void deleteEnrollment(Long id) {
        enrollmentRepo.deleteById(id);
    }
}
