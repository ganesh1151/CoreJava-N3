package org.tnsif.encapsulationdemo;

//to demonstrate program on encapsulation
public class HDFC {
	//data member
	private int pin;
	void accept() {
		System.out.println("The ATM pin is : "+pin);
	}
	

	//getter and setter method
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
