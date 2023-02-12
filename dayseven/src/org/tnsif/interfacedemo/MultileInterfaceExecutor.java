package org.tnsif.interfacedemo;
//program to demonstrate on multiple inheritance using interface
//driver class
public class MultileInterfaceExecutor {
	public static void main(String[] args) {
		User obj=new User();
		System.out.println(obj.loanType());
		System.out.print(obj.getInterest());
	}

}
