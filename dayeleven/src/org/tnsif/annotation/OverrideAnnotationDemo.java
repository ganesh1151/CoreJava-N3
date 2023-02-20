package org.tnsif.annotation;
//demo on override annotation
class parent{
	public void print() {
		System.out.println("parent class method");
	}
}
class child extends parent{
	@Override
	public void print() {
		super.print();
		System.out.println("child class method");
	}
}
public class OverrideAnnotationDemo {

	public static void main(String[] args) {
		parent p=new parent();
		p.print();

	}

}