package ArrayInJava2;

import java.util.Scanner;

		public class StringArray2D {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the number of rows and columns:");
		        int row = sc.nextInt();
		        int col = sc.nextInt();

		        // Creating a 2D String array
		        String[][] arr = new String[row][col];

		        // Input values for the 2D array
		        System.out.println("Enter the string elements:");
		        for (int i = 0; i < row; i++) {
		            for (int j = 0; j < col; j++) {
		                arr[i][j] = sc.next();
		            }
		        }

		        // Printing array elements
		        System.out.println("Array elements are:");
		        for (int i = 0; i < row; i++) {
		            for (int j = 0; j < col; j++) {
		                System.out.print(arr[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		}

	

