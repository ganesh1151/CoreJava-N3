package org.tnsif.polymorphism;

import java.util.Scanner;

//diver class
public class ConstructorOverloadingExecutor {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the speed and color of a hondacity");
		
		int speed=sc.nextInt();
		sc.nextLine();
		
		String color=sc.nextLine();
		
		HondaCity h=new HondaCity();
		
		HondaCity h1=new HondaCity(speed,color);
		
	}

}
