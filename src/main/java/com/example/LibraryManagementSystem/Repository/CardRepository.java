package com.example.LibraryManagementSystem.Repository;

import com.example.LibraryManagementSystem.Model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
