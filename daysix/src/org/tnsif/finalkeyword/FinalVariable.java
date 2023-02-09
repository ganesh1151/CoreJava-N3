package org.tnsif.finalkeyword;

public class FinalVariable {
	
	final static int x=15;
	public static void print() {
			//we can't change the value of x here x is declare as final
			//x=19;
			System.out.println("The value of x is : "+x);
		
	}
	public static void main(String args[]) {
		FinalVariable.print();
	}

}
