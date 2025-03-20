package stringInJava;

public class StringsInJava {

	public static void main(String[] args) {
		/*
		 *strings
		 *
		 *it is a group of characters
		 *
		 *ex:table
		 *need to be enclose within "",
		 *
		 *how to declare the strings
		 *
		 *1.using string literal
		 *String var_name = "string_name";
		 *
		 *2.using new keyboard
		 *String var_name = new String("string_name");
		 *
		 * */
		
		String str1 = "String1";
		String str2 = new String("String1");
		String str3 = "String1";
		String str4 = new String("String1");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.equals(str2));//t
		System.out.println(str1==str2); //this will check for references/address //false
		System.out.println(str1==str3);//t
		System.out.println(str1.equals(str3));//t
		System.out.println(str2.equals(str4));//t
		System.out.println(str2==str4);//f
		
		
		//we cannot change the value of string but we 
	}

}
