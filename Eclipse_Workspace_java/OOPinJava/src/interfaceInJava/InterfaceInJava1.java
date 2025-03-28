package interfaceInJava;

interface A{
	public void methodA();
}

interface B{
	public void methodB();
}

class Child implements A,B{
	
	public void methodB() {
		System.out.println("this is method B");
	}
	
	public void methodA() {
		System.out.println("this is method A");
	}
}


public class InterfaceInJava1 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		Child child = new Child();
		child.methodA();
		child.methodB();
	}

}
