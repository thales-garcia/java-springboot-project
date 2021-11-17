package com.example.javaspringcourse.repositories;

import com.example.javaspringcourse.entities.Category;
import com.example.javaspringcourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
