package com.form.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.form.validation.model.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student, Long>{

	/*
	 * spring data jpa -> jpa -> hibernate -> jdbc -> database
	 * 
	 * 1 
	 */
}