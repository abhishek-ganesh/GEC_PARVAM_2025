package ControlStatement;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[]args) {
//		int day= 2;
//		switch(day) {
//		case 1 ->System.out.println("Monday");
//		case 2 ->System.out.println("tuesday");
//		case 3 ->System.out.println("wednesday");
//		case 4 ->System.out.println("thursday");
//		case 5 ->System.out.println("friday");
//		case 6 ->System.out.println("saturday");
//		case 7 ->System.out.println("sunday");
//		default ->System.out.println("invalid day");		
//		}
		
//		System.out.println("enter number : ");
//		Scanner sc = new Scanner(System.in);
//		int day = sc.nextInt();
//		switch(day) {
//		case 1 ->System.out.println("weekday");
//		case 2 ->System.out.println("weekday");
//		case 3 ->System.out.println("weekday");
//		case 4 ->System.out.println("weekday");
//		case 5 ->System.out.println("weekday");
//		case 6 ->System.out.println("weekend");
//		case 7 ->System.out.println("weekend");
//		default ->System.out.println("invalid day");		
//		}
		
//		System.out.println("enter number : ");
//		Scanner sc = new Scanner(System.in);
//		int day = sc.nextInt();
//		switch(day) {
//		case 1,2,3,4,5 -> System.out.println("weekday");
//		case 6,7 -> System.out.println("weekend");
//		default ->System.out.println("invalid");
//		}
		
		
		System.out.println("enter number : ");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		String res = switch(day) {
		case 1,2,3,4,5 -> "weekday";
		case 6,7 -> "weekend";
		default -> "invalid day";
		};
		System.out.println("the result is : "+ res);
		
	}

}
