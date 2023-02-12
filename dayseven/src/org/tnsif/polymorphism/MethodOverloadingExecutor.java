package org.tnsif.polymorphism;
//program to demonstrate on method overloading
//driver class
import java.util.Scanner;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the resolution and slottype "
				+"of a cellphone");
		
		int resolution =sc.nextInt();
		sc.nextLine();
		
		String slottype=sc.next();
		
		Smartphone sp=new Smartphone();
		sp.setResolution(resolution);
		sp.setSlottype(slottype);
		
		sp.display(resolution);
		sp.display(resolution, slottype);
		
		Multiplication m=new Multiplication();
		System.out.println(m.mul(19, 5));
		System.out.println(m.mul(5.2f, 3));
		
		
	}

}
