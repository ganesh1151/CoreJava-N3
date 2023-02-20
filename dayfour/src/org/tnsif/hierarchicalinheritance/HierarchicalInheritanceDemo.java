package org.tnsif.hierarchicalinheritance;

import java.util.Scanner;

public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the type,and versoin");
		String type=s.nextLine();
		int version=s.nextInt();
		int version1=s.nextInt();
		KitKat s1=new KitKat(type,version);
		s1.setType(type);
		s1.setVersion(version);
		
		Tiramisu t=new Tiramisu(type,version);
		t.setType(type);
		t.setVersion(version1);
		
		System.out.print(s1);
		System.out.print(t);
		 
	}

}