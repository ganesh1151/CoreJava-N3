package org.tnsif.decisionmaking;

import java.util.Scanner;
//example of if statement
public class IfDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		
		if(a==b)
			System.out.println("a is equal to b");
		System.out.println("a is not equal to b");
			
		//output
		/*
		 19
		19
		a is equal to b
		a is not equal to b
		 */
	}

}
