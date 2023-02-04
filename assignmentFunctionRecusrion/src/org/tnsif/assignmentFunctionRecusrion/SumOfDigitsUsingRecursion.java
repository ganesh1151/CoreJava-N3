package org.tnsif.assignmentFunctionRecusrion;

import java.util.Scanner;

//to demonstration Sum Of Digits of a number using Recursion function
public class SumOfDigitsUsingRecursion {

	//function definition
	static int SumOfDigit(int n) {
		if(n==0)
		{
			return 0;
		}
		int r=n%10;
		n=n/10;
		return r+SumOfDigit(n);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for n");
		int n=sc.nextInt();
		
		//function call
		System.out.println("Sum Of Digits of given number is : "+ SumOfDigit(n));
		
		sc.close();


	}

}
