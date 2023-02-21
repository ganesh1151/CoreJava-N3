package org.tnsif.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

//program to demonstrate on sortedset
public class TreeSetDemo {

	public static void main(String[] args) {
		//TreeSet is used to arrange in sorted order
		SortedSet<String>obj=new TreeSet<>();
		obj.add("gautam");
		obj.add("Ganesh");
		obj.add("Gaurav");
		
		
		System.out.println(obj);

	}

}
