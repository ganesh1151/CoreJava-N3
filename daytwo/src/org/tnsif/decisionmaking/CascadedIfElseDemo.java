package org.tnsif.decisionmaking;

import java.util.Scanner;
//Demonstrate for cascaded if..else

public class CascadedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
			System.out.print("a is greater");
		else if(b>a && b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");
		

	}

}
