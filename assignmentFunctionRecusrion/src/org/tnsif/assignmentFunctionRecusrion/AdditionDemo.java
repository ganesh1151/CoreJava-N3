package org.tnsif.assignmentFunctionRecusrion;

import java.util.Scanner;

// Demonstration of "Function"
public class AdditionDemo {
	
	 // Function Definition
	/*
	static int addition(int x,int y) {
		int sum=x+y;
		return sum;
	}*/
	
	static void addition(int x,int y) {
		int sum=x+y;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//Function Call
		//System.out.println(addition(a,b));
		addition(a,b);
		sc.close();
		

	}

}
