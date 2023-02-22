package com.example.Student_Library_Management_System2.Repositories;

import com.example.Student_Library_Management_System2.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
