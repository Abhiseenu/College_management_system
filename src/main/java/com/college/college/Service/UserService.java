package com.college.college.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.college.college.Entity.User;
import com.college.college.Repository.UserRepository;
import com.college.college.dto.SignupRequest;
@Service 
public class UserService { 
 
    @Autowired 
    private UserRepository userRepository; 
 
    @Autowired 
    private PasswordEncoder passwordEncoder; 
 
    public void register(SignupRequest request) { 
        if (userRepository.existsByUsername(request.getUsername())) { 
            throw new RuntimeException("Username already exists"); 
        } 
 
        User user = new User(null, null, null, null); 
        user.setUsername(request.getUsername()); 
        user.setName(request.getName()); 
        user.setPassword(passwordEncoder.encode(request.getPassword())); 
        user.setEmail(request.getEmail()); 
        user.setPhoneno(request.getPhone()); 
 
        userRepository.save(user); 
    } 
}