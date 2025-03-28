package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInJava {

	public static void main(String[] args) {
		/*
		 * Generics
		 * =========
		 * to provide the type safety and to avoid the type casting in collection then we should go for generic
		 * 
		 * 
		 */

		char[] arr = {'a','b','c'}; //type safety
		char firstEle = arr[0];  // without type casting required
		System.out.println(firstEle);
		
		
		//without Generics
		List arr1 = new ArrayList();  //there is no type safety
		arr1.add(12);
		arr1.add(10.9);
		arr1.add("hello");
		int value = (int) arr1.get(0);  //explicit type casting
		System.out.println(value);
		
		//with Generics
		List<Integer> list = new ArrayList<Integer>();  //type safety
		list.add(12);
		list.add(120);
//		list.add(10.9);
		int a = list.get(1);
		System.out.println(a);  //there is no concept of type casting
		System.out.println(list);
		
	}

}
