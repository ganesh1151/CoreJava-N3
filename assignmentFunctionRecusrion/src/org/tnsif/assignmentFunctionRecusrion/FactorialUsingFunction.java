package org.tnsif.assignmentFunctionRecusrion;

import java.util.Scanner;

//to demonstration an example on factorial of a number using function 
public class FactorialUsingFunction {
	
	//function definition
	static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
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
