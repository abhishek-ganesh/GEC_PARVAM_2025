package exceptionInJava;

public class ExceptionInJava1 {

	public static void main(String[] args) {
		/*
		 * unchecked exception(runtime)
		 * 
		 *
		 */
		int a = 10;
		int b = 10;
		try {
			System.out.println("Result is : " +(a/b));
		}catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("hello world");
	}

}
