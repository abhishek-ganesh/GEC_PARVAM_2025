package exceptionInJava;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionInJava {
//	public void display() {
//		display();
//	}

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Exxeption in Java:
		 * ===================
		 * 
		 * there is a unwanted or un-expected event occur in the program 
		 * when ever there is exception the normal flow will stpos.
		 * 
		 * 
		 * 2.types:
		 * 1.checked exception(compile time) - FileNoFoundException
		 * 2.Unchecked Exception(runtime) - arrayIndexOutBoundException
		 * 
		 * Error:
		 * =======
		 * it is a problem where the programmer cannt handle it ex: stcakoverflow error
		 * 
		 * */
//		ERROR
//		ExceptionInJava.display();
		
		
		//checked exception
		//1. try catch
		//2.throws
//		try {
//			PrintWriter printWriter = new PrintWriter("abc.txt");
//			printWriter.println("hello World");
//			System.out.println("hello world");
//			printWriter.close();
//		}catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println(e);
//		}
		
		
		//7.throws
		PrintWriter printWriter = new PrintWriter("abc.txt");
		printWriter.println("hello World");
		System.out.println("hello world");
		printWriter.close();
	
	
	}

}
