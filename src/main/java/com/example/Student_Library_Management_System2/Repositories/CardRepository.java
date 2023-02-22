package com.example.Student_Library_Management_System2.Repositories;

import com.example.Student_Library_Management_System2.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Integer> {
}
