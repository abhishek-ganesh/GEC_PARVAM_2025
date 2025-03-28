package interfaceInJava;



interface pet{
	public void makeSound();
}

class Cat implements pet{
	public void makeSound() {
		System.out.println("cat meow");
	}
}






interface Animal{
	public void makeSound();
}

class Dog implements Animal{
	
	public void makeSound() {
		
		System.out.println("dog barks");
	}
}





public class InterfaceInJava {

	public static void main(String[] args) {
		/*
		 * inerface used when if we dont know the complete implement
		 * 
		 * interface:
		 * ===========
		 * it is a blue print of the class
		 * the article in the interface by default abstract(abstract :does not contain any value)
		 * from java 8 we can write default and static method in interface
		 * 
		 * 
		 * 
		 * interface interface_name{
		 * code
		 * }
		 * 
		 * interface Animal{
		 * 	public void makeSound();
		 * }
		 * */
		
		Dog dog = new Dog();
		dog.makeSound();
		
		Cat cat = new Cat();
		cat.makeSound();
		
		
	}

}
