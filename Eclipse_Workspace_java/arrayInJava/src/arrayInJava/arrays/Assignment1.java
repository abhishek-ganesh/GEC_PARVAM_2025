package arrayInJava.arrays;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array: ");
		int size = sc.nextInt();
		int [] arr = new int [size];
		
		System.out.println("enter the value for array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter"+ i + "th element" );
			arr[i]=sc.nextInt();

		}
		
		System.out.println("Array Elements are: ");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]+"");
		}
		sc.close();
	}

}
