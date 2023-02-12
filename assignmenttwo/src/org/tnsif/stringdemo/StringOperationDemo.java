package org.tnsif.stringdemo;

//program to demonstrate on different string operation
public class StringOperationDemo {

	public static void main(String[] args) {
		String s1=new String("Bhujbal");
		String s2=s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s1.substring(4,7));
		System.out.println(s1.isEmpty());
		

	}

}
