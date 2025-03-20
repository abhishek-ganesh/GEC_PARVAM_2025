package stringInJava;

public class StringsInJava2 {

	public static void main(String[] args) {
		/*
		 * strings methods:
		 * 
		 * 1.equals
		 * 2.
		 * 3.compareTo
		 * concat
		 * touppercase
		 * tolowercase
		 * trim
		 * startswith
		 * strip
		 * equalsignorecase
		 * isBlank()
		 * */
		
		String str1 = new String("hello World");
		String str2 = new String("hello world");
		
		//1.equals
		System.out.println("equals :"+str1.equals(str2));
		
		//2.equalsignorecase
		System.out.println("equalsIgnorecase :"+str1.equalsIgnoreCase(str2));
		
		//3. ==
		System.out.println(" == "+ str1==str2);
		
		//4. concat
		System.out.println("concat : "+str1.concat(" ").concat(str1).concat(" hi "));
		
		//5. touppercase
		System.out.println("to uppercase : "+ str1.toUpperCase());
		
		//6. tolowercae
		System.out.println("to lowercase : "+ str1.toLowerCase());
		
		//7.trim
		System.out.println("trim : "+ str1.trim());
		
		//8.stratswith
		System.out.println("startswith : "+str1.startsWith(str2));
		
		//9.endswith
		System.out.println("startswith : "+str1.endsWith(str2));
		
		//10.strip
		System.out.println("strip : "+str1.strip());
		
		//11.isBlank
		System.out.println("isBlank : "+ str1.isBlank());
	}

}
