package operators.java;

public class Operators {

	public static void main(String[] args) {
		/*
		 * ARITHMATIC OPERATORS + - / * 
		 * UNARY OPERATORS ++ --
		 * ASSIGNMENT OPERATORS =, +=,-=,*=,/=, %=
		 * RELATIONAL OP <,>,<=,>=,!=,==
		 * lOGICAL OP &&,||,!
		 * TERNARY OP ?:
		 * BITWISE OP &,!,~
		 * SHIFT OP >>,<<
		 * INSATNCE OF OP 
		 * */
		
//		Arithmetic Operators
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
//		Unary Operators
		System.out.println(a++);
		System.out.println(a--);
		
//		Assignment Operator		
		System.out.println(a=b);
		System.out.println(a+=b);
		System.out.println(a-+b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
		
//		Relational Operators
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
//		Logical Operators
		boolean x = true;
        boolean y = false;
      
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
		
        
//      Ternary operator
        String res = (a<b)? "lesser" : "greater";
        System.out.println(res);
        
        
//      Bitwise Operators
        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a ^ b : " + (a ^ b));
        System.out.println("~a : " + (~a));
        System.out.println("a << 2 : " + (a << 2));
        System.out.println("a >> 1 : " + (b >> 1));
        System.out.println("a >>> 1 : " + (b >>> 1));
        
        
//      Shift Operators
        System.out.println("a<<1 : " + (a << 1));
        System.out.println("a>>1 : " + (a >> 1));
        
        
        
//      instanceof operator
        
	}

}
