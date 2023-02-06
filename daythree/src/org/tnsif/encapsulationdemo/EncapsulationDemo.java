package org.tnsif.encapsulationdemo;

import java.util.Scanner;

//Driver class
public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin : ");
		h.setPin(sc.nextInt());
		System.out.println(h.getPin());
		h.accept();

	}

}
