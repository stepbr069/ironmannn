package com.java.velvetvista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.velvetvista.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{}