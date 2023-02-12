package org.tnsif.abstraction;

public class AbstractionExecutor {

	public static void main(String[] args) {
		ButterChicken b=new ButterChicken();
		//we can't instantiate the abstract class
		//Menu m=new Menu();
		
		b.foodType();
		b.menuType();
		b.recipe();
	}

}
