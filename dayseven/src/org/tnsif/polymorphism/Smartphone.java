package org.tnsif.polymorphism;
//program to demonstrate on a Method overloading 
public class Smartphone {
	
	//private data member
	private int resolution;
	private String slottype;
	//Method overloading in terms by passing no.of arguments
	void display(int resolution)
	{
		System.out.println("Camera Resolution : "+resolution);
	}
	
	void display(int resolution, String slottype)
	{
		System.out.println("Camera Resolution : "+resolution+","+"Slottype : "+slottype);
	}
	
	//generate getters and setters method

	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	public String getSlottype() {
		return slottype;
	}

	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	
	
}
