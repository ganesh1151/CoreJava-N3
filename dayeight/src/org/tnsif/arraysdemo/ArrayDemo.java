package org.tnsif.arraysdemo;
import java.util.Arrays;
//to demonstrate program on array to take input from user
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements "+"int the array");
		
		int n=sc.nextInt();
		//array declaration
		int arr[]=new int[n];
		//to allocate the value of an array
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array elements are");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		System.out.println();
		//to sort array elements
		Arrays.sort(arr);
		System.out.println("Array elements after sorting");
		/*
		 for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		*/
		
		//using enhance for loop
		for(int itr:arr)
		{
			System.out.print(itr+" ");
		}
		
		

	}

}
