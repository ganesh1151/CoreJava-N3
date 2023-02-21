package org.tnsif.mapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		//unorder 
		Map<Integer,String>obj=new HashMap<>();
		
		obj.put(411001,"MG Road");//pune
		obj.put(422001,"MG Road");//nashik
		System.out.println(obj);
		
		
		//order 
				Map<Integer,String>obj1=new LinkedHashMap();
				
				obj1.put(411001,"MG Road");//pune
				obj1.put(422001,"MG Road");//nashik
				System.out.println(obj);

	}
	
}
