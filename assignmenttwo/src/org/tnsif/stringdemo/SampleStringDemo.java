package org.tnsif.stringdemo;
//program to demonstrate an example on string creation
import java.util.Scanner;

public class SampleStringDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		/*
		 //using string literal
		
		System.out.println("Enter the first String :" );
		String str1=sc.nextLine();
		System.out.println("Fist String is : "+str1);
		
		//using new keyword
		System.out.println("Enter the second string : ");
		String str2=new String(sc.nextLine());
		System.out.println("Second string is : "+str2);
		
		
		//if(str1==str2) if you use one string created by literal and another one is new and if string are equal 
		//then it will gives output different
		
		if(str1.equals(str2))
		{
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
		*/
		
		char c[]= {'H','e','l','l','o'};
		String str3=new String (c);
		System.out.println(str3);
	}
}
