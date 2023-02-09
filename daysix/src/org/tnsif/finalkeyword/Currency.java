package org.tnsif.finalkeyword;

//program to demonstrate final class
public final class Currency {
	
	//private data members
	private String type;
	void print()
	{
		System.out.println("Currency type is: "+type);
	}
	
	//generate getters and setters
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
