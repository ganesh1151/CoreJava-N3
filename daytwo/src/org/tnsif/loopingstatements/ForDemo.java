package org.tnsif.loopingstatements;
import java.util.*;
//to demonstrate example on "for loop"
public class ForDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("print number from 1 to N");
		// to print 1 to N numbers
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//to print N to 1
		System.out.println("print number from N to 1");
		for(int i=n;i>0;i--) {
			System.out.print(i+" ");
		}
		
	}
}

//OUTPUT
/*
 15
print number from 1 to N
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 
print number from N to 1
15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 
 */
