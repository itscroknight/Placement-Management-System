package com.app.placement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.placement.entity.Student;
import com.app.placement.repository.StudentRepository;

import java.util.List;

@Service
public class SearchService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> searchStudents(String keyword) {
        return studentRepository.findByNameContaining(keyword);
    }
}
