package org.tnsif.polymorphism;


//program to demonstrate on method overriding

//parent class
public class RBI {
	
	float getInterest() {
		return 10.8f;
	}
	
	/*If we use method overrding in the same class we will get error,
	//so we have to use inheritance to achieve method overing
	
	float getInterest() {
		return 12.8f;
	}
	*/
}
