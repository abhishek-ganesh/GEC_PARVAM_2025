package com.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava {

	public static void main(String[] args) {
		/*
		 * LinkedList:
		 * ============
		 * linked list ubderline data structure is doubly linked list
		 * linked list allow duplicate
		 * linked list will allow ramdom access(using index)
		 * linked list will allow null value
		 * linked list will preserve the order of insertion
		 */
		
		List<Integer> list = new LinkedList<Integer>();
		list.add(45);
		list.add(45);
		list.add(null);
		list.add(23);
		list.add(30);
		System.out.println(list);
		System.out.println(list.get(2));
		
		/*
		 * linked list underline data structure is doubly linked list arraylist dynamic array
		 * 
		 * linked list will occupy more memory(3 nodes)
		 * arraylist will occupy less memory
		 * 
		 * when ever there is a continuous operation on deletion we should go for linked list
		 * whenever there is a continious operation on deletion then we should not go for arraylist
		 * 
		 */
		

	}

}
