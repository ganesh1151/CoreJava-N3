package org.tnsif.superkeyword;
//program to demonstrate an exmaple of super keyword in terms of varriable

//parent class
public class Flower {
	private String name;

	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	///default constructor
	public Flower() {
		super();
		System.out.println("Flower -Parent class");
	}
	
	
	//parameterize constructor
	public Flower(String name) {
		super();
		this.name = name;
	}
	
	
	
}
