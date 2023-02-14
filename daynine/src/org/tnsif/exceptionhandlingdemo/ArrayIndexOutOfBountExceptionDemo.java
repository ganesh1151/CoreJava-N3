package org.tnsif.exceptionhandlingdemo;

public class ArrayIndexOutOfBountExceptionDemo {

	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("Second Line");
		try {
			int[] myIntArray=new int[] {1,2,3};
			System.out.println(myIntArray);
		}
		catch(Exception e) {
			System.out.println("the array doesn't have fourth element!"+e);
		}
		System.out.println("Third Line");
	}
	public static void print(int[] arr) {
		System.out.println(arr[3]);
	}
	

}
