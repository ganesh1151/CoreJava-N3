package org.tnsif.finalkeyword;

public class Pineapple extends Cake{
	
	private int price;
	
	/*if any method is delcared as final in parent class and we
	 are going to use that method inside the child class
	 then it can not be override it but we can overload it
	 */
	final void display(int price) {
		System.out.println("The price is : "+price);
	}
	
	//Generate getters and setters
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
