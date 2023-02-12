package org.tnsif.interfacedemo;
//program to demonstrate interface


//implement class
public class Avenger implements Bike{

	@Override
	public void milege(int speed) {
		System.out.println("Speed is : "+speed);
		
	}

	@Override
	public void engine() {
		System.out.println("Working on petrol");
		
	}

}
