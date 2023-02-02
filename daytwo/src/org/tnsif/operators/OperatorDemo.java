package org.tnsif.operators;

import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		//Arithmetic Operators
		/*System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		*/
		
		//Relational Operators
		/*boolean res=x>y;
		boolean res1=x<y;
		boolean res2=x<=y;
		boolean res3=x>=y;
		boolean res4= x==y;
		boolean res5= x!=y;
		
		System.out.println("value of res :" +res);
		System.out.println("value of res1 :" +res1);
		System.out.println("value of res2 :" +res2);
		System.out.println("value of res3 :" +res3);
		System.out.println("value of res4 :" +res4);
		System.out.println("value of res5 :" +res5);
		*/
		
		//Assignment Operators
		/* 
		 x*=y;  // x=x*y
		
		System.out.println(x);
		x+=y;
		System.out.println(x);
		x-=y;
		System.out.println(x);
		x/=y;
		System.out.println(x);
		x%=y;
		System.out.println(x);
		 */
				
		//Logical Operator
		/*
		boolean res2= (5==5) && (5>3);
		boolean res3= (5==5) || (5>3);
		boolean res4= !(5==4);
		
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		*/
		
		//bitwise Operator
		/*
		int a=10,b=2;
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(a<<b);
		System.out.println(a>>b);
		*/
		
		
		//increment and decrement Operator
		/*int c=5,d=7;
		c=++d;
		System.out.println(c);
		c=d++;
		System.out.println(c);
		c=d--;
		System.out.println(c);
		c=--d;
		System.out.println(c);
		*/
		
		
		//Ternary Operator
		//checking even or odd
		String res5=(13%2==0)?"True":"False";
		System.out.println(res5);
		
		
	}

}
