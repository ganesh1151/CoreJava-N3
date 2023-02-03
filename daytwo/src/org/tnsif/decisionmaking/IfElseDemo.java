package org.tnsif.decisionmaking;

import java.util.Scanner;
//If Else demo
public class IfElseDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a==b)
			System.out.println("a is equal to b");
		else 
			System.out.println("a is not equal to b");
			
		
		//output
		/*
		 12
		23
		a is not equal to b

		 */
	}

}
