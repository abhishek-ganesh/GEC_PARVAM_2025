package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Registration {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private int age;
    private String email;
    private String phone;
    private String password;
    private Date dob;
    private String city;
    private String gender;
    
    @ElementCollection
    private List<String> skills;
    
    @Column(length = 500)
    private String address;
}
