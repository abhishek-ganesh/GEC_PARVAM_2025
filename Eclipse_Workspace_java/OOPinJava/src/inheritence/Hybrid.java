package inheritence;


class ParentClass2{
	public void parentMethod(){
	System.out.println("this is a Parent method");
	}
}

interface Interface2{
	public void method();
}

class ChildClass3 extends ParentClass2 implements Interface2 {
	public void childmethod() {
		System.out.println("this is child class");
	}
	
	@Override
	public void method () {
		System.out.println("interface inheritence");
	}
}


public class Hybrid {

	public static void main(String[] args) {
		ChildClass3 childclass3 = new ChildClass3();
		childclass3.childmethod();
		childclass3.method();
	}

}

