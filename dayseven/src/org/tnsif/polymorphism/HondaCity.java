package org.tnsif.polymorphism;
//program to demonstrate on constructor overloading
public class HondaCity {
	private int speed;
	private String color;
	
	//Generate getters and setters
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	//constructor overloading
	
	HondaCity(){
		System.out.println("I Like to drive a HondaCity");
		
	}
	
	//Constructor Overloading with no. of arguements
	public HondaCity(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
		System.out.println("The speed of HondaCity is : "+speed +" and color is : "+color);
	}
	
	
	
	
}
