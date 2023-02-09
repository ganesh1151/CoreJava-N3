package org.tnsif.staticdemo;

public class StaticBlock {
	//non-static variable
	private int num;
	
	//static variable
	private static String name;
	
	//Static block
	//static block is used to initialise static variable
	static {
		name="Ganesh";
	}
	
	
	//getters and stters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StaticBlock.name = name;
	}
	
}
