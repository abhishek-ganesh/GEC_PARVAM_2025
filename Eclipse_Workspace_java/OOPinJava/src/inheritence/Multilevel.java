package inheritence;

class GrandParentClass{
	public void grandParentMethod() {
		System.out.println("this is Grand Parent Method");
	}
	
}

class ParentClass1 extends GrandParentClass{
	public void parentMethod() {
		System.out.println("this is a Parent Method");
	}
	
}

class ChildClass extends ParentClass1{
	public void childMethod() {
		System.out.println("this is child method");
	}
	
}

public class Multilevel {
	public static void main(String [] args) {
		ChildClass Childclass = new ChildClass();
		Childclass.childMethod();
		Childclass.parentMethod();
		Childclass.grandParentMethod();
		
	
	}


}
