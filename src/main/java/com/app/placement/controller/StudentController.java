package com.app.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.app.placement.entity.Student;
import com.app.placement.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteCertificate(@PathVariable Long id) {

         studentService.deleteCertificate(id);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(
            @PathVariable Long id, 
            @RequestBody Student updatedStudent) {
              Student updated = studentService.updateStudent(id, updatedStudent);
              return ResponseEntity.ok(updated);
              
    }
    
}
