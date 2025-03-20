package introduction_to_java.first_program;

import java.util.Scanner;

public class StudentData {

	
	public static void main(String[] args) {
		
		System.out.println("enter Student Name");
		Scanner a = new Scanner(System.in);
		String stdName = a.nextLine();
		
		
		byte stdAge = 0;
		System.out.println("enter Student age : ");
		Scanner b = new Scanner(System.in);
		stdAge = b.nextByte();
		
		
		double stdMarks = 0;
		System.out.println("enter Student Marks : ");
		Scanner c = new Scanner(System.in);
		stdMarks = c.nextDouble();
		
		
		System.out.println("enter Student Gender");
		Scanner d = new Scanner(System.in);
		String stdGender1 = d.nextLine();
		
		
		System.out.println("enter Student Gender");
		Scanner e = new Scanner(System.in);
		String stdBranch = e.nextLine();
		
		
		System.out.println("Student Name is : "+ stdName);
		System.out.println("Student age is : "+stdAge);
		System.out.println("Student Marks is : "+stdMarks);
		System.out.println("Student gender is : "+ stdGender1);
		System.out.println("Student Branch is : "+ stdBranch);
		
	}

}
