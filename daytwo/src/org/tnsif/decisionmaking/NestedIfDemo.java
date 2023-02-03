package org.tnsif.decisionmaking;

import java.util.Scanner;
//to demonstrate the example on nested if
public class NestedIfDemo {

	public static void main(String[] args) {
		// Nested if Program
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<120)
				{
					System.out.println("Eligible for jumping");
				}
				else
				{
					System.out.println("Extra loops will added");
				}
			}
			else {
				System.out.println("Not Eligible");
			}
		}
		else {
			System.out.println("Not Eligible for jumping");
		}
		
		
	//output
	/*
	 12
	 30
     Not Eligible
	 */
	}

}
