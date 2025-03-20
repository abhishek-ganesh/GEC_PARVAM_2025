package arrayInJava.arrays;

import java.util.Scanner;

public class ArrayInJava2 {

	public static void main(String[] args) {
		/*
		 * 2D array
		 */
		
//		int [][] arr = new int [2][2];//2*2 ->4
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[1][0] = 30;
//		arr[1][1] = 40;
//	
//		for (int i = 0; i < 2; i++) {
//			for(int j=0;j<2;j++) {
//				System.out.print(arr[i][j]+"");
//			}
//			System.out.println();
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows and columns");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int [][] arr = new int [row][col];//2*2 ->4
	
		for (int i = 0; i < row; i++) {
			for(int j=0; j< col; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
			System.out.println("array elements are : ");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
				
			}
		
	}

}
