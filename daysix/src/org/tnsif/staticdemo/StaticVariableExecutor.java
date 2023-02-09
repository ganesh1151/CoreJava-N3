package org.tnsif.staticdemo;
//program to demonstrate on static variable
public class StaticVariableExecutor {
	public static void main(String[] args) {
	StaticVariable s=new StaticVariable("Ganesh Chavan");
	System.out.println(s);
	
	
	//use classname.variable to call static variable
	System.out.println(StaticVariable.companyName);
	}

}
