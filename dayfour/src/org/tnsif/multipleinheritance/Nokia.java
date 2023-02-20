package org.tnsif.multipleinheritance;
//to demonstrate the example on multilevel inheritance
public class Nokia {
      private int modelno;
      public void display() {
    	  System.out.print("the model no is:"+modelno);
      }
      //default constructor
	public Nokia() {
		System.out.print("nokia class");
	}
	public Nokia(int modelno) {
		super();
		this.modelno = modelno;
	}
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	
      
}