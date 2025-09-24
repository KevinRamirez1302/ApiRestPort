package com.example.apiRestPort.repository;

import com.example.apiRestPort.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface iUserRepository  extends JpaRepository<User,Long> {
}
