package org.tnsif.interfacedemo;
//program to demonstrate interface

//diver class
public class InterfaceExecutor {
	public static void main(String[] args) {
		//we can't instantiate interface
		//Bike b=new Bike();
		
		Avenger a=new Avenger();
		a.engine();
		a.milege(45);
	}
}
