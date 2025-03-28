package pojo;

class Student {
	private String name;
	private int age;
	private double marks;
	
	public Student() {
		super();
	}
	public Student(String name, int age, double marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

}


public class PojoClass {
	public static void main(String[] args) {
		/*
		 * 
		 * POJO Class:
		 * ===========
		 * 
		 * plain old java object(POJO)
		 * rules:
		 * ======
		 * 
		 * 1.the class is should not extends or implements any class or interface
		 * 2.Every fields(states/properties) should be private
		 * 3. All -args Constructor
		 * 4.No -args Cosntructor
		 * 5.toString()
		 * Getter and setter public methods
		 * */
		
		Student std = new Student();
		System.out.println(std);
	}

}
