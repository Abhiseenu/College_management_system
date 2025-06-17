package com.college.college.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users") 
public class User {
    @Id
    @GeneratedValue(strategy  = GenerationType.AUTO)
    private Long id;
    private String name;
    private String username;
    private String  password;
    private String email;
    private String phoneno;
    private String role = "ROLE_USER";
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public User(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }
    public User(Long id, String username, String password, String phoneno) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phoneno = phoneno;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
    
}
