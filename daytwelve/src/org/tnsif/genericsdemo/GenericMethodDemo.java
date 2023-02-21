package org.tnsif.genericsdemo;
//program to demonstrate on generic class
class GenericMethod{
	public  static<E>void print(E[] elements) {
		for(E itr:elements) {
			System.out.print(itr+" ");
		}
		System.out.println();
	}
}
public class GenericMethodDemo {

	public static void main(String[] args) {
		GenericMethod  m=new GenericMethod();
		Integer[] array1= {10,40,35,60};
		Character[] array2= {'s','q','a','p'};
		System.out.println("string array:");
		m.print(array1);
		System.out.println("caharacter array:");
		m.print(array2);
	}

}