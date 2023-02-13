package org.tnsif.arraysdemo;
//program to demonstrate on Jagged array
import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of row");
		int m=sc.nextInt();
		
		int arr[][]=new int[m][];
		for(int i=0;i<m;i++)
		{
			System.out.println("Enter the value for "+ i +" subscript " +" :");
			int n=sc.nextInt();
			arr[i]=new int[n];
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		//for print array
		for(int i=0;i<m;i++)
		{
			
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
