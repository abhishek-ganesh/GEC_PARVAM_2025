package com.project.webapps.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/*
 * java SE - standard edition
 * java EE or j2ee - java enterprise edition - javax
 * jakarta
 */



@Entity
@Table(name = "students")

public class Student {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "std_id")
		private long id ;
		@Column(name = "std_name")
		private String name;
		
		
		public Student(long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}		
}

