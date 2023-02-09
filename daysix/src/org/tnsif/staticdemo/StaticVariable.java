package org.tnsif.staticdemo;

public class StaticVariable {
	
	//non-static variable
	private String name;
	
	//static variable
	public static String companyName="TechnoServe India";

	public StaticVariable(String name) {
		super();
		this.name=name;
	}

	@Override
	public String toString() {
		return "StaticVariable [name=" + name + "]";
	}

	
	
}
