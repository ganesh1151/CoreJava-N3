package org.tnsif.assignmentFunctionRecusrion;

import java.util.Scanner;

//to demonstration an example on factorial of a number using Recursion function
public class FibonacciUsingRecusion {
	
	//function definition
	static int fibonacci(int n) {
		if(n==0)
			return 0;
		if(n==1 || n==2)
			return 1;
		return fibonacci(n-2)+fibonacci(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for n");
		int n=sc.nextInt();
		
		System.out.println("Fabonacci series of given number is :");
		//function call
		for(int i=0;i<n;i++) {
			System.out.print(fibonacci(i)+" ");
		}
		sc.close();

		

	}

}
