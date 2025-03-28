package abstraction;

//1
interface Animal{
	public void eat();
}

class Lion implements Animal {
	public void eat() {
		System.out.println("lion will eat meat");
	}
}


//2 abstract class
abstract class Vehicle{
	public abstract void start();
	
	//non-abm
	public void stop() {
		System.out.println("the vehicle is stopped");
	}
}

class Car extends Vehicle {
	public void start() {
		System.out.println("CAR  start with key");
	}
}


public class Abstraction {

	public static void main(String[] args) {
		/*
		 * Abstraction
		 * ===========
		 *  it is a process of hiding theimplementation and showing onky the essential resources
		 *  
		 *  2-ways
		 *  =========
		 *    1. interface(100%)
		 *    2. abstract class( 0 -100)
		 * */
		
		Lion lion = new Lion();
		lion.eat();
		
		Car car = new Car();
		car.start();
		car.stop();
		
		Vehicle v = new Vehicle() {
		@Override
		public void start() {
			System.out.println("start ab 2");			
		}
		};
	
	v.start();
	v.stop();
	}
}
