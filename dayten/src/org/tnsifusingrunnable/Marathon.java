package org.tnsifusingrunnable;
//program to demonstrate on runnable interface for a thread
public class Marathon implements Runnable{
	
	//private data members
	private int speed;
	private String city;
	public static void main(String[] args) {
		

	}

	//runnable interface contains run() method by default
	@Override
	public void run() {
		System.out.println("Speed of participant: "+speed+"the city is : "+city);
		
	}

	//generate getters and setters
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
