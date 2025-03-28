package final_this_super;

class NewAnimal{
	public String name;
	public int age;
	public NewAnimal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name : "+this.name);
		System.out.println("age : "+this.age);
	}
}

class NewDog extends NewAnimal{
	public String eat;
	
	public NewDog(String name, int age, String eat) {
		super(name, age);
		this.eat = eat;
	}
	
	public void display() {
		super.display();
		System.out.println("dog eats: "+this.eat);
		System.out.println("name of dog once again : " + super.name);
}	
}

public class SuperInJava{
	
	public static void main(String[] args) {
		/*
		 * super:
		 * =======
		 * 	1. it is used to call super class instance variables
		 * 	2. it is used to call super class constructor
		 *  3. it is used
		 * 
		 * */
		
		NewDog newdog = new NewDog("dog1", 12, "rite");
		newdog.display();
		
		

}

}