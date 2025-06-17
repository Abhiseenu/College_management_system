package com.college.college.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.college.Entity.Student;
import com.college.college.Repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;
    
    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }
    
    public Student getStudent(Long id) {
        return studentRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Student not found"));
    }
    
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
    
    public Student updateStudent(Long id, Student updatedStudent) {
        Student existing = getStudent(id);
        existing.setName(updatedStudent.getName());
        existing.setEmail(updatedStudent.getEmail());
        existing.setDepartment(updatedStudent.getDepartment());
        existing.setPhoneNo(updatedStudent.getPhoneNo());
        return studentRepo.save(existing);
    }
    
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }
}
