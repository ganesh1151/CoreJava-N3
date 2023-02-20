package org.tnsif.annotation;
class DepracratedDemo{
	@Deprecated
	//Depracrated method is used with methods,fields etc.
	public void display() {
		System.out.println("deprecated annotation demo");
	}
}

public class DeprecatedAnnotationDemo {

	public static void main(String[] args) {
		DepracratedDemo d=new DepracratedDemo();
		d.display();

	}

}