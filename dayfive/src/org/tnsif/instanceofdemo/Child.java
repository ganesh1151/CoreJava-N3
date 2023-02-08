package org.tnsif.instanceofdemo;
//to demonstrate an exmaple on instaceof operator

//child class
public class Child extends Person{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	//defualt constructor
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterize constructor
	public Child(String name, String address,int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}

	
	
	
	
	
	

}
