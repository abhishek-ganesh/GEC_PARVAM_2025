package com.CustomStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StartStudent {

	public static void main(String[] args) {
		Student std1 = new Student("Mohan", 13, 23);
		Student std2 = new Student("Murali", 22, 24);
		Student std3 = new Student("Murali", 56, 27);
		List<Student> students = new ArrayList<>();
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(new Student("Mohan",38, 30));
		System.out.println("Before");
		System.out.println(students);
		//students.remove(0);
		//System.out.println(students);
//		Collections.sort(students, (s1,s2)->s2.getRoll_num()-s1.getRoll_num());
		Collections.sort(students, (s1,s2)->s1.getAge()-s2.getAge());

		System.out.println("After");
		System.out.println(students);
		
	}

}
