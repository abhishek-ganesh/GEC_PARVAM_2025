package com.generics;

class Student<T>{
	T student_id;
	
	public Student(T student_id) {
		super();
		this.student_id = student_id;
	}
	
	public T returnValue() {
		return student_id;
	}
	
}

public class GenericClassDemo {

	public static void main(String[] args) {
//		Student std = new Student(12);
//		int value = std.returnValue();
//		System.out.println(value);
		
		Student<Integer> std1 = new Student<>(12);
		System.out.println(std1.returnValue());
		Student<String>std2 = new Student<>("student2");
		System.out.println(std2.returnValue());

	}

}
