package com.college.college.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.college.Entity.User;
import java.util.Optional; 
public interface UserRepository extends JpaRepository< User,Long> {

    boolean existsByUsername(String username); 
Optional<User> findByUsername(String username);
} 
    

