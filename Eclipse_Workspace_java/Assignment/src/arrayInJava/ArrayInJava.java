package arrayInJava;

public class ArrayInJava {

	public static void main(String[] args) {
		// String array example in Java
		String[] arr = new String[5];
		arr[0] = "Java";
		arr[1] = "Python";
		arr[2] = "C++";
		arr[3] = "JavaScript";
		arr[4] = "Ruby";
		// arr[5] = "PHP"; // ArrayIndexOutOfBoundsException

		// Assigning a new value to all elements
		for (int i = 0; i <= 4; i++) {
		    arr[i] = "Hello";
		}

		// Printing the array using enhanced for loop
		for (var str : arr) {
		    System.out.println(str + " ");
		    System.out.print(str + " ");
		}
		
	}

}
