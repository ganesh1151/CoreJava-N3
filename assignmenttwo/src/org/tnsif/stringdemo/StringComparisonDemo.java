package org.tnsif.stringdemo;
//program to demonstrate a string comparison
public class StringComparisonDemo {

	public static void main(String[] args) {
		// Creating a string using literals
		String s1="TNSIF";
		String s2="TNSIF";
		
		
		//creating a string using new operator
		String s3=new String("TNSIF");
		String s4=new String("TNSIF");
		
		//string comparison
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		
		
		//using compare to 
		System.out.println(s1.compareTo("tnsif"));
		System.out.println(s1.compareToIgnoreCase("tnsif"));
		System.out.println(s1.compareTo(s2));

	}

}
