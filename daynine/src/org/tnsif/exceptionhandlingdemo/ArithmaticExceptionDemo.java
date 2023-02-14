package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;
//program to demonstrate on ArithmaticException
public class ArithmaticExceptionDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterthe value of x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		//try block contains the exception code
		try {
			int res=x/y;
			System.out.println(res);
		}
		
		//catch block handles the exception thrown by try block
		catch(Exception e) {
			System.out.println("Exception handling using catch : "+e);
		}
		finally {
			System.out.println("Finally block");
		}
		
	}
}
