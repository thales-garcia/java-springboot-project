package com.example.javaspringcourse.repositories;

import com.example.javaspringcourse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
