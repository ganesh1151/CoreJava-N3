package org.tnsif.classandobject;

import java.util.Scanner;

//driver class
public class ConstructorDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int id;
		String custname;
		String city;
		//Customer c=new Customer(19,"Ganesh","Pimpalgaon");
		
		//Method calling
		//c.display();
		
		
		
		int n=1;
		while(n<=2)
		{
			System.out.println("Enter Id, Customer Name and City ");
			id=sc.nextInt();
			sc.nextLine();
			
			custname=sc.nextLine();
			city=sc.nextLine();
			
			//object of class
			Customer c1=new Customer();
			c1.setId(id);
			c1.setCustname(custname);
			c1.setCity(city);
			
			//Method calling
			//c1.display();
			
			
			System.out.println(c1.getId());
			System.out.println(c1.getCustname());
			System.out.println(c1.getCity());
			
			n++;
		}
		
		
	}

}
