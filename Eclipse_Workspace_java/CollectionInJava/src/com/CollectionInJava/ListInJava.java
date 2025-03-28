package com.CollectionInJava;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {

	public static void main(String[] args) {
		/*
		 * List :
		 * =======
		 * it is a child Interface of collection
		 * 
		 * it will contain some of the built in methods that used inside a list implemented classes only
		 * 
		 * when you represented a group of individual object as a single entity where order is preserved and index based access and duplicate is allowed
		 * 
		 * when order is preserved adn index based access and duplicate is allowed
		 */
		List list = new ArrayList();
		list.add(2);
		list.add("hello");
		list.add(10.67);
		System.out.println(list);
		String str = (String) list.get(1);
		System.out.println(str);
		double value = (double) list.get(2);
		System.out.println(value);

	}

}
