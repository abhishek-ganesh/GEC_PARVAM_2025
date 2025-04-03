package com.dependencyInjection;

public class StartApplication {

	public static void main(String[] args) {
//		Address address = new Address("hassan", "Karnataka");
		//1. constructor injection
//		Student student = new Student(01, "Abhi", address);
//		System.out.println(student.getId());
//		System.out.println(student.getName());
//		Address address1 = student.getAddress();
//		System.out.println(address1.getCity());
//		System.out.println(address1.getState());
		
		
		//2.setter injection
		Address address2 = new Address();
		address2.setCity("bengaluru");
		address2.setState("karnataka");
		
		Student student2 = new Student();
		student2.setId(02);
		student2.setName("guru");
		student2.setAddress(address2);
		
		System.out.println(student2.getId());
		System.out.println(student2.getName());
		Address address3 = student2.getAddress();
		System.out.println(address3.getCity());
		System.out.println(address3.getState());

	}

}
