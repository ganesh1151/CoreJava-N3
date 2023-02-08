package org.tnsif.instanceofdemo;
//to demonstrate an example of instanceof operator
//parent class
public class Person {
	//data members
	private String name;
	private String address;
	
	
	
	//generate getter and setter method
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//defualt constructor
	public Person() {
		System.out.println("Parent class");
	}
	
	//parameterize constructor
	

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	
	
	
	
	
}
