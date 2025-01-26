package com.app.placement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.placement.entity.Student;
import com.app.placement.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    
    

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
    
    public void deleteCertificate(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            System.out.println("Delete Successfull");
        } else {
            throw new RuntimeException("Student not found with id: " + id);
        }
    }
    
    public Student updateStudent(Long id, Student updatedStudent) {
        return studentRepository.findById(id).map(student -> {
            student.setName(updatedStudent.getName());
            student.setQualification(updatedStudent.getQualification());
            student.setCourse(updatedStudent.getCourse());
            student.setYearOfPassing(updatedStudent.getYearOfPassing());
            return studentRepository.save(student);
        }).orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }
}
