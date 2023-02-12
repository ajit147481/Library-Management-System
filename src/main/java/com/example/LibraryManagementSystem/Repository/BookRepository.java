package com.example.LibraryManagementSystem.Repository;

import com.example.LibraryManagementSystem.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
