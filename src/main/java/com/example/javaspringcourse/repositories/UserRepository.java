package com.example.javaspringcourse.repositories;

import com.example.javaspringcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
