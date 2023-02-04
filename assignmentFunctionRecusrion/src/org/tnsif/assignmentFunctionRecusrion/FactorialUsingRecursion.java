package org.tnsif.assignmentFunctionRecusrion;

import java.util.Scanner;

//to demonstration an example on factorial of a number using Recursion function 
public class FactorialUsingRecursion {
	
	//function definition
	static int factorial(int n) {
		if(n!=0)
		{
			return n*factorial(n-1);
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for n");
		int n=sc.nextInt();
		
		//function call
		System.out.println("Factorial of given number is : "+ factorial(n));
		
		sc.close();

	}

}
