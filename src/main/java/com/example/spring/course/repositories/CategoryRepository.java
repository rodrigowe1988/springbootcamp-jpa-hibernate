package com.example.spring.course.repositories;

import com.example.spring.course.entities.Category;
import com.example.spring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
