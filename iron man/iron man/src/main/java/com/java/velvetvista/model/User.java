package com.java.velvetvista.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="student_email")
    private String email;
    @Column(name="password")
    private String Password;
    @Column(name="gender")
    private String Gender;
    @Column(name="phno")
    private long Phone_number;
    public User(int id, String name, String email, String password, String gender, long phone_number) {
        this.id = id;
        this.name = name;
        this.email = email;
        Password = password;
        Gender = gender;
        Phone_number = phone_number;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    public long getPhone_number() {
        return Phone_number;
    }
    public void setPhone_number(long phone_number) {
        Phone_number = phone_number;
    }


}