package org.tnsif.polymorphism;
//program to demonstrate on method overloading
public class Multiplication {
	
	
	//method overloading in terms of changing the data types
	int mul(int x,int y) {
		return x*y;
	}
	
	int mul(float x,int y) {
		return (int) (x*y);
	}
	
}
