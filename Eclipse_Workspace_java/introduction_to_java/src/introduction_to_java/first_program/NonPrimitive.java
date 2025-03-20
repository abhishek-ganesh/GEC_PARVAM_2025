package introduction_to_java.first_program;

import java.util.Scanner;

public class NonPrimitive {
	/*
	 * Array
	 * 
	 * <datatype>[] arrayname = {};
	 * 
	 * String
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		int [] array1 = {1,2,3,4,5};
		System.out.println(array1[2]);
		
		String name = "Abhishek Ganesh";
		System.out.println(name);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Name");
		String v = sc.nextLine();
//		char v= sc.next().charAt(5);
		System.out.println(v);
	}

	
}
