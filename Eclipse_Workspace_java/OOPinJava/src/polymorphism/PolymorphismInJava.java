package polymorphism;

class Person{
	public void walking() {
		System.out.println("the person is walking");
	}
}

class Mohan extends Person {
	public void walking() {
		System.out.println("mohan is walking");
	}
}

//2 method - overloading
class Addition {
	public void add(int a, int b) {
		System.out.println("addition is : "+(a+b));
	}
	public void add(int a, int b, int c) {
		System.out.println("Addition is :" +(a+b+c));
	}
}


public class PolymorphismInJava {
	public static void main(String[] args) {
		
		/*
		 * polymorphism:
		 * =============
		 * 
		 * poly -> many
		 * morphism -> forms
		 * 
		 * it is a mechansim that methods will perform a different actions bSED ON THE situation
		 * 1. method - overloading(one class)
		 * 2.method- overriding(two class) 
		 * */
		
		//1. method overriding /dynamic poly  / run time poly / dynamic binding
		Mohan mohan = new Mohan();
		mohan.walking()	;
		
		

		//2 method overloading / compiletime polymor / 
		Addition addition = new Addition();
		addition.add(10,20);
		addition.add(10, 20, 30);
		
	}

}
