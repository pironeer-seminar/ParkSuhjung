package com.example.piroweek4.repository;

import com.example.piroweek4.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}