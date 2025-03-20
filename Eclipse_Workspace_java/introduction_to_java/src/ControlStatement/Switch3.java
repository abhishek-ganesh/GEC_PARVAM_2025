package ControlStatement;

public class Switch3 {

	public static void main(String[] args) {
		Object obj = 5;
		
		switch (obj)
		{
		case String s ->System.out.println("string type");
		case Integer s ->System.out.println("int type");
		default ->System.out.println("invalid");

		}
	}

}
