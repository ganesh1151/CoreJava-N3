package org.tnsif.polymorphism;

public class SBI extends RBI {
	
	//overriding parent class Method
	float getInterest() {
		System.out.println(super.getInterest());
		return 12.8f;
		
	}
	
}
