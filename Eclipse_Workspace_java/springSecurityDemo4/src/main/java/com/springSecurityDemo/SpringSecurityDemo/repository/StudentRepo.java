package com.springSecurityDemo.SpringSecurityDemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springSecurityDemo.SpringSecurityDemo.models.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
	Optional<Student> findByEmail(String email);
}
