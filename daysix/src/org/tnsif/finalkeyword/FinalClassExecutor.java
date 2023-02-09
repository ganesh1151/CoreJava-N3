package org.tnsif.finalkeyword;
//program to demonstrate on final class
//diver class
public class FinalClassExecutor {

	public static void main(String[] args) {
		Currency c=new Currency();
		c.setType("Dollar");
		c.print();
		
		Dollar d=new Dollar();
		d.print();

	}

}
