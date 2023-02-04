package org.tnsif.assignmentFunctionRecusrion;

import java.util.Scanner;
//to demonstration Number Of Digits of a given number using do while loop
public class NumberOfDigits {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for n");
		int n=sc.nextInt();
		
		int res=0;
		do {
			res++;
			n=n/10;
		}while(n>0);
		//function call
		System.out.println("Number of digits in given number is : "+ res);
		
		sc.close();


	}

}
