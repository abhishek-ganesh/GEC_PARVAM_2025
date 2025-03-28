package final_this_super;

class Person{
	public String name;
	public int age;
	
	//no args
	public Person() {
		System.out.println("default constructor");
	}
	
	// all args
	public Person(String name, int age) {
		this();
		System.out.println("all args constructor");
		this.name = name;
		this.age = age;
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	public void display() {
		this.sayHello();
		System.out.println("Name is : "+this.name);
		System.out.println("Age is : "+age);
	}
}
public class ThisInJava {

		public static void main(String[] args) {
				/*
				 * This keyboard:
				 * ==============
				 * 
				 *  1. used to refer instance variables current class
				 *  2. used to refer 
				 * 
				 * */
			
			Person person = new Person();
			person.display();
			
			Person person1 = new Person();
			person1.display();

		}
	}