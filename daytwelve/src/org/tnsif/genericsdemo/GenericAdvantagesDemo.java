package org.tnsif.genericsdemo;
//program to demonstrate on advantages of generics
import java.util.ArrayList;

public class GenericAdvantagesDemo {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList<>();
		obj.add(15);
		obj.add("15");
		System.out.println("without generics"+obj);
		ArrayList<Integer> obj1=new ArrayList<>();
		obj1.add(15);
		//obj.add("15");
		System.out.println("with generics"+obj1);
		
		//2.typecasting is not allowed in generics
		ArrayList obj2=new ArrayList<>();
		obj2.add("met");
		//typecasting
		String str=(String)obj2.get(0);
		System.out.println(str);
		
		//with generics ,typecasting is not allowed
		ArrayList<String> obj3=new ArrayList<>();
		obj3.add("met");
		String str1=obj3.get(0);
		System.out.println(obj3);
	}

}