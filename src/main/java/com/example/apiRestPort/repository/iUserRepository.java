package com.example.apiRestPort.repository;

import com.example.apiRestPort.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUserRepository  extends JpaRepository<User,Long> {
}
