package com.CollectionInJava;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*
		 * ArrayList:
		 * ===========
		 * Array list is a improved version of array(Dynamic Array)
		 * Array list underline data structure is Dynamic array
		 * Array list allow duplicate
		 * Array list allow random Access(using index)
		 * Array list will allow null value
		 * Array list will preserve the order of insertion
		 * 
		 */
		
		ArrayList<Integer>list = new ArrayList<Integer>();
		list.add(12);
		list.add(1);
		list.add(1);
		list.add(null);
		list.add(null);
		list.add(34);
		list.add(12);
		list.add(1);
		list.add(1);
		list.add(null);
		list.add(null);
		list.add(34);
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.size());
		list.remove(0);
		
	}

}
