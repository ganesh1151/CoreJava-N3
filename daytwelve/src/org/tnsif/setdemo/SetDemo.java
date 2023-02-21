package org.tnsif.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//program to demonstrate difference between hashset and linkedhashset
public class SetDemo {

	//hashSet is unorder and linkedhashset is order
	
	public static void main(String[] args) {
		
		//set1
		Set<Object>obj1=new HashSet<>();
		obj1.add(11);
		obj1.add("Ganesh");
		obj1.add(19.20f);
		System.out.println("Set1 elements are : "+ obj1);
		
		
		//set2
				Set<Object>obj2=new LinkedHashSet<>();
				obj2.add(11);
				obj2.add("Ganesh");
				obj2.add(19.20f);
				System.out.println("Set1 elements are : "+ obj2);
		
				
		
	
	}

}
