package wrapperClasses;

public class WrapperClasses {

	public static void main(String[] args) {
		/*
		 * java is a pure oop or not :
		 * ===========================
		 * --> No (primitive data type)
		 * 
		 * primitive datatypes:
		 * =====================
		 * 
		 * byte, short, int, long, float, double, char, boolean
		 * 
		 * String name = new String("mohan");
		 * 
		 * collections:
		 * =============
		 * to store group of individual objects as a single entity
		 * 
		 * 10,20,30,40 ----> int(primitive data type)
		 * 
		 * 
		 * Wrapper Classes:
		 * =================
		 * byte  --> Byte
		 * short --> Short
		 * int --> Integer
		 * long --> Long
		 * float --> Float
		 * double --> Double
		 * char --> Character
		 * boolean --> Boolean
		 * 
		 */
		
		
		
//		1.AutoBoxing  --> from primitive to Wrapper 
		int a = 100;
		Integer i = Integer.valueOf(a);
//		Integer i = a
		System.out.println("Int:  "+a);
		System.out.println("Integer: "+i);		
		System.out.println("Integer type: "+i.getClass().getName());
		
		
		
		byte b = 100;
		Byte j = Byte.valueOf(b);
		System.out.println("byte:  "+b);
		System.out.println("BYTE: "+j);		
		System.out.println("BYTE type: "+j.getClass().getName());
		
		
		
//		2.Unboxing
		Integer i1 = 10;
		int a1 = i1.intValue();
//		int a1 = i1;
		System.out.println("Int:  "+a1);
		System.out.println("Integer: "+i1);
		System.out.println("Integer: "+i1.getClass().getName());
		
		
		
		Byte i2 = 10;
		byte a2 = i2.byteValue();
		System.out.println("BYTE:  "+a2);
		System.out.println("BYTE: "+i2);
		System.out.println("BTYE: "+i2.getClass().getName());
		
		
		Character i3 = 10;
		char a3 = i3.charValue();
		System.out.println("Char: "+a2);
		System.out.println("Char: "+i2);
		System.out.println("Char: "+i2.getClass().getName());
		
		
	}

}
