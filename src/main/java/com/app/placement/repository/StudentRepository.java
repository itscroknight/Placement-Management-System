package com.app.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.placement.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameContaining(String name);
}
