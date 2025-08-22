package com.ex7.project7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex7.project7.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
