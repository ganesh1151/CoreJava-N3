package org.tnsif.staticdemo;
//program to demonstrate on static method
public class StaticMethod {
	
	//data members
	private static double salary=45000.68;
	public static void display() {
		System.out.println("Salary is: "+salary);
	}
	
	//generate getters and setters
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}

