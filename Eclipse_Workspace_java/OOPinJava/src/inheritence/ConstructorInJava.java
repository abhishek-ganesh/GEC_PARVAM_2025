package inheritence;


class Student1{
//	states
	public int age;
	public String name;
	public double marks;
	
//	full argument constructor
	public Student1(int age, String name, double marks) {
			System.out.println("Full args Constructor");
			this.age = age;
			this.name = name;
			this.marks = marks;
	}
	
//	no-args constructor
	public Student1() {
		System.out.println("no args constructor");
	}

//	actions
	public void isPlaying() {
		System.out.println(this.name+" is playing");
	}
	
	public void isSleeping() {
		System.out.println(this.name+" is sleeping");
	}
	public void display() {
		System.out.println("name : "+this.name);
		System.out.println("age : "+this.age);
		System.out.println();
	}
}


public class ConstructorInJava {

	public static void main(String[] args) {
		Student1 std1 = new Student1(01, "abhi", 400.0);
		std1.display();
		Student1 std2 = new Student1();
		std2.display();
	}

}
