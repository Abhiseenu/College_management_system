package com.college.college.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.college.Entity.Faculty;
import com.college.college.Repository.FacultyRepository;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepo;
    
    public Faculty createFaculty(Faculty faculty) {
        return facultyRepo.save(faculty);
    }
    
    public Faculty getFaculty(Long id) {
        return facultyRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Faculty not found"));
    }
    
    public List<Faculty> getAllFaculty() {
        return facultyRepo.findAll();
    }
    
    public Faculty updateFaculty(Long id, Faculty updatedFaculty) {
        Faculty existing = getFaculty(id);
        existing.setName(updatedFaculty.getName());
        existing.setEmail(updatedFaculty.getEmail());
        existing.setDesignation(updatedFaculty.getDesignation());
        existing.setDepartment(updatedFaculty.getDepartment());
        return facultyRepo.save(existing);
    }
    
    public void deleteFaculty(Long id) {
        facultyRepo.deleteById(id);
    }
}
