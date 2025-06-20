package com.college.college.Service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.college.college.Entity.User;
import com.college.college.Repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override 
    public UserDetails loadUserByUsername(String username) throws 
UsernameNotFoundException { 
        User user = userRepository.findByUsername(username) 
            .orElseThrow(() -> new UsernameNotFoundException("User not found")); 
 
        return new org.springframework.security.core.userdetails.User( 
                user.getUsername(), 
                user.getPassword(), 
                Collections.emptyList() 
        ); 
    }
}