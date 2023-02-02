package org.tcsif.intro;

import java.util.Scanner;

//TO demonstrate the example on user-input
public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//@SuppressWarnings("resource")  first way for removing warning
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		/*float y=sc.nextFloat();
		char z=sc.next().charAt(0);
		String name= sc.next(); // it read only single word
		String str=sc.nextLine(); // it read more than two word
		double d=sc.nextDouble();
		*/
		
		sc.close(); // second way for removing warning 
		
		System.out.println("The value of x :" +x);
		/*System.out.println("The value of y :" +y);
		System.out.println("The value of z :" +z);
		System.out.println("The value of name :" +name);
		System.out.println("The value of str :" +str);
		*/
		
		
		
		//OUTPUT
		/*
		 19
		The value of x :19
		 */
	}

}
