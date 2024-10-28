package com.user_signIn_signup.signInsignup.models;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "email", length = 255, nullable = false)
    private String email;

    @Column(length = 255, nullable = false)
    private String password;

    private String phone;

    // @Column(name = "created_at", nullable = false)
    // private Timestamp created_at;

    // @Transient
    // @Column(name = "updated_at")
    // private Timestamp updated_at;

    public User() {
    }

    public User(String name, String email, String password, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        // this.created_at = created_at;
        // this.updated_at = updated_at;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // public Timestamp getCreated_at() {
    //     return created_at;
    // }

    // public void setCreated_at(Timestamp created_at) {
    //     this.created_at = created_at;
    // }

    // public Timestamp getUpdated_at() {
    //     return updated_at;
    // }

    // public void setUpdated_at(Timestamp updated_at) {
    //     this.updated_at = updated_at;
    // }
}
