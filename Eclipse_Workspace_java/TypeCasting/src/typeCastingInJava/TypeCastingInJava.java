package typeCastingInJava;

public class TypeCastingInJava {

	public static void main(String[] args) {
		/*
		 * type casting
		 * =============
		 * conversion of one data type to another
		 * 
		 * 1.implicit
		 * ============
		 * byte -> short -> long -> float -> byte
		 * 
		 * 2.explicit type casting
		 * ========================
		 * double -> float -> long -> int -> short -> byte
		 * 
		 */
		
		int a = 10;
		long a2 = a;
		
		System.out.println("int : "+a);
		System.out.println("float : "+a2);

//		1.explicit type casting
//		long a3 = 10;
//		int a4 = (int)a3;
//		
//		System.out.println("int :" +a4);
//		System.out.println("long : "+a3);
		
//		1.1
//		long a5 = 10;
//		byte a6 = (byte)a5;
//		
//		System.out.println("long :" +a5);
//		System.out.println("byte : "+a6);
		
//1.2		
//		float a3 = 10;
//		int a4 = (int)a3;
//		
//		System.out.println("float :" +a4);
//		System.out.println("long : "+a3);
		
		short a3 = 10;
		long a4 = (long)a3;
		
		System.out.println("short :" +a4);
		System.out.println("long : "+a3);
//		
//		long a3 = 10;
//		int a4 = (int)a3;
//		
//		System.out.println("int :" +a4);
//		System.out.println("long : "+a3);
	}

}
