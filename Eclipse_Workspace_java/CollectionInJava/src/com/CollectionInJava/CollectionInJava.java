package com.CollectionInJava;

public class CollectionInJava {

	public static void main(String[] args) {
		/*
		 * drawback of arrays:
		 * ===================
		 * 
		 * 1.fixed size
		 * 2.same data type elements
		 * 3.we cannot reduce the size of an array
		 * 
		 * 
		 * advantages of an array 
		 * ========================
		 * 1.random access
		 * 2.type safety - the elements inside the array is basically the datatype
		 * 3.type-casting - to print elements in array s=no need to type cas
		 */
		
		int [] arr = new int [2];
		arr[0] = 12;
		arr[1] = 20;
		
		System.out.println((int)arr[0]);  //no need of type casting
		System.out.println(arr[1]);
		
	}

}
