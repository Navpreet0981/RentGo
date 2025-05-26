package com.rentgo.backend.dto;

public class LoginRequest {
    private String username;
    private String password;
    private String role;  // new field to specify role during login

    // Constructors
    public LoginRequest() {}

    public LoginRequest(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters & Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
