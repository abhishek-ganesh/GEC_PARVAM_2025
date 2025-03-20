package ControlStatement;

import java.util.Scanner;

public class controlstatement {

	public static void main(String[] args) {
		/*
		 * if, if else, else if, switch statement
		 * 
		 * if (Condition){
		 * }
		 * else
		 * {
		 * }
		 * 
		 * 
		 * if(condition){
		 * }
		 * else if {
		 * }
		 * else if {
		 * }
		 * else{
		 * }
		 * 
		 * 
		 * */

//		if
//		int a = 5;
//		int b = 10;
//		
//		if (a>b) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}
//		
//		
//		
//		if else
//		int a = 5;
//		int b = 10;
//		
//		if (a>b) {
//			System.out.println("false");
//		}
//		else if(a>=4){
//			System.out.println("false");
//		}
//		else {
//			System.out.println("true");
//		}
		
		int day = 0;
		switch (day) {
		case 0:{
			System.out.println("sunday");
		}
		break;
		case 1: {
			System.out.println("Monday");
		}
		break;
		
		case 2: {
			System.out.println("tuesday");
		} 
		break;
		
		case 3: {
			System.out.println("wednesday");
		}
		break;
		case 4:{
			System.out.println("thursday");
		}
		break;
		
		case 5:{
			System.out.println("friday");
		}
		break;
		
		case 6:{
			System.out.println("saturday");
		}
		break;
		
		}
		
	}

}
