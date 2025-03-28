package inheritence;


//1. Single level
class Parent {
	int Data = 100;
	void parentMethod() {
		System.out.println("this is parent method");
	}
	public static void childMethod1() {
		System.out.println("this is child method");
	}
}
class Child2 extends Parent{
	int cData = 200;
	public void childMethod() {
		System.out.println("this is child method");
	}
	
	public void parentMethod() {
		System.out.println("this is parent method ");
	}
}


public class InheritenceInJava {

	public static void main(String[] args) {
		/*
		 * Inheritence :
		 * =============
		 * 
		 * extending the properties of parent class to child class
		 * properties(state and action)
		 * 
		 * types:
		 * ======
		 * 1.Single level
		 * 2.multilevel
		 * 3.heirarchical
		 * 4.hybrid
		 * 5.multiple -> not possible
		 * 
		 * */
		
		Child2 child2 = new Child2();
		child2.parentMethod();
		child2.childMethod();
		System.out.println(child2.Data);
		System.out.println(child2.cData);
		
	}
}
