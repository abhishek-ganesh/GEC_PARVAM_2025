package introduction_to_java.first_program;

import java.util.Scanner;

public class UserInputValues {
	public static void main(String[] args) {
		int stdAge = 0;
		System.out.println("enter your age : ");
		Scanner sc = new Scanner(System.in);
		stdAge = sc.nextInt();
		System.out.println("your age is : "+stdAge);
		
		byte byte_val = 0;
		System.out.println("byte value is : ");
		Scanner b = new Scanner(System.in);
		byte_val = b.nextByte();
		System.out.println("the byte value is "+byte_val);
		
		short short_val = 0;
		System.out.println("enter short value: ");
		Scanner c = new Scanner(System.in);
		short_val = c.nextShort();
		System.out.println("the short value is : "+short_val);
		
		boolean bol_val;
		System.out.println("enter boolean value : ");
		Scanner d = new Scanner(System.in);
		bol_val = d.nextBoolean();
		System.out.println("boolean value is "+bol_val);
		if (bol_val)
		{
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}

}
