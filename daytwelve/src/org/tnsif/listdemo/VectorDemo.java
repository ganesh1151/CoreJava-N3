package org.tnsif.listdemo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<Object> obj1=new Vector<>();
        obj1.add(101);
         obj1.add(30.8f);
        obj1.add('z');
       obj1.add(30.8);
       System.out.println("first list is:"+obj1);
       System.out.println("size of list 1:"+obj1.size());
       System.out.println("is list two empty?"+obj1.isEmpty());
       obj1.remove(0);
       System.out.println("first list is:"+obj1);
       System.out.println(obj1.contains(101));
       System.out.println("element at location"+obj1.get(1));
       System.out.println("index of z:"+obj1.indexOf('z'));
       System.out.println("last index of 30.8 is:"+obj1.indexOf(30.8));
       obj1.clear();
       System.out.println(obj1);
       //to extract the element from the list
       for(Object itr:obj1) {
      	 System.out.println(itr+" ");
       }
       
       List<Integer>obj2=new LinkedList<>();
       obj2.add(67);
       obj2.add(16);
       obj2.add(45);
       System.out.println("list 2 is:"+obj2);
       //to sort it ascending order
       Collections.sort(obj2);
       System.out.println("ascending order:"+obj2);
       Collections.reverse(obj2);
       System.out.println("descending order:"+obj2);
      // System.out.println(obj2.d);
	}

}