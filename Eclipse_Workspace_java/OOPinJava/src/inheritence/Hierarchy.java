package inheritence;

class ParentClass {
	public void parentMethod(){
	System.out.println("this is a parent method");
	}
}

class ChildClass1 extends ParentClass{
	public void childMethod() {
		System.out.println("this is child1 class");
	}
}

class ChildClass2 extends ParentClass{
	public void childMethod() {
		System.out.println("this is child2 class");
	}
}

public class Hierarchy {

	public static void main(String[] args) {

		ChildClass1 childclass1 = new ChildClass1();
		childclass1.childMethod();
		
		ChildClass2 childclass2 = new ChildClass2();
		childclass2.childMethod();
	}
	
}
