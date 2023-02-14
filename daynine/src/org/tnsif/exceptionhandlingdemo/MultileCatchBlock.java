package org.tnsif.exceptionhandlingdemo;
//program to demonstrate on multiple catch block
import java.util.Scanner;

public class MultileCatchBlock {

	public static void main(String[] args) {
		
		int arr[]=new int[] {101,23,45};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x and y : ");
		int x=sc.nextInt();
		int y=sc.nextInt();

		try {
			int res=x/y;
			System.out.println(res);
			System.out.println(arr[3]);
		}
		//we can use multiple catch block
		/*catch(ArithmeticException e) {
			
			System.out.println("Exception handled"+e);
			//System.exit(0)
			
		}
		
		 catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		*/
		//if we have multiple catch block then we can use pipe operator
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled "+e);
		}
	}

}
