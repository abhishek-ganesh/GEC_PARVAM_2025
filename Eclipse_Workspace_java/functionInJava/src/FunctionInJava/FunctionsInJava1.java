package FunctionInJava;

public class FunctionsInJava1 {
	
//	1. public function
//	anywhere
	public void publicFunction() {
		System.out.println("this is public Function");
	}
	
//	2. private function
//	within class
	private void privateFunction() {
	}
	
//	3.default function
//	within the package
	void defaultFunction() {
	System.out.println("this default function");
	}
	
//	4.protected function
//	within package and subclass in other package
	protected void protectedFunction() {
	System.out.println("this is protected Function");	
	}
	
//	5.static function
	public static void staticFunction() {
		System.out.println("this is a static function");
	}
	
	public static void main(String[] args) {
	FunctionsInJava1 obj1 = new FunctionsInJava1();
	obj1.publicFunction();
	obj1.protectedFunction();
	obj1.defaultFunction();
	staticFunction();
		
	}

}
