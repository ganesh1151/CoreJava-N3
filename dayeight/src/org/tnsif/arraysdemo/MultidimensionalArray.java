package org.tnsif.arraysdemo;
//program to demonstrate multi-dimensional array
import java.util.Scanner;

public class MultidimensionalArray {

	public static void main(String[] args) {
		/*int [][] a= {{10,20,30},{40,50,60}};
		System.out.println(a[0][0]); //10
		System.out.println(a[1][0]); //40
		System.out.println(a[1][1]); //50
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for array size and its subscript");
		int m=sc.nextInt();
		int n=sc.nextInt();
				
	    int arr[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
