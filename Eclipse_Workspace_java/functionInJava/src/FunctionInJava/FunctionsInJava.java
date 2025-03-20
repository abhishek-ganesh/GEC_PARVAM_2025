package FunctionInJava;

public class FunctionsInJava {
	
//	1.
	public int add(int a, int b) {
		return(a+b);
	}

// 2.
	public void add2(int a, int b) {
	System.out.println(a+b);	
	}
	
// 3. 
	public int c() {
		return 50;
	}
	
// 4.
	public void d() {
		System.out.println(5);
	}
	
		
	public static void main(String[] args) {
		/*
		 * functional/methods in java
		 * 
		 * <access modifier> return_type function_name(parameter){
		 * code
		 * }
		 * 
		 * public void add(int 1, int b){
		 * syso(a+b);
		 * }
		 * 
		 * two:
		 * 
		 * 1.built-in   - next(),nextline(),println(),equals()
		 * 2.user-defined:
		 * 
		 * 
		 * a.function return a value not accepting parameter
		 * b.function return a value and accept a parameter
		 * c.function not return a value but accepting parameter
		 * d.function not return a value also not accepting parameter
		 * */
		
		FunctionsInJava obj1 = new FunctionsInJava();
		int res = obj1.add(19, 20);
		System.out.println("output is : "+res);
		
		FunctionsInJava obj2 = new FunctionsInJava();
		obj2.add2(23, 23);
		
		FunctionsInJava obj3 = new FunctionsInJava();
		int res1=obj3.c();
		System.out.println(res1);
		
		FunctionsInJava obj4 = new FunctionsInJava();
		obj4.d();

		
		
		
	}

}
