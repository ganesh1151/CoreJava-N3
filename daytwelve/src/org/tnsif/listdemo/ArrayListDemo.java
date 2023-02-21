package org.tnsif.listdemo;
//program to demonstrate on array list
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*collection is an interface,we can't create object for collection 
		 */
		//list1
         Collection<Object> obj=new ArrayList<>();
         obj.add(101);
         obj.add(30.8f);
         obj.add('z');
         System.out.println("first list is:"+obj);
       //list2
         List<Object> obj1=new ArrayList<>();
         /* obj1.add(101);
           obj1.add(30.8f);
          obj1.add('z');
          */
         obj1.addAll(obj);
         obj1.add(30.8);
         System.out.println("second list is:"+obj1);
         System.out.println("size of list 1:"+obj.size());
         System.out.println("is list two empty?"+obj1.isEmpty());
         obj.remove(101);
         System.out.println("first list is:"+obj);
         System.out.println(obj.contains(101));
         System.out.println("element at location"+obj1.get(1));
         System.out.println("index of z:"+obj1.indexOf('z'));
         System.out.println("last index of 30.8 is:"+obj1.indexOf(30.8));
         obj.clear();
         System.out.println(obj);
         
         
         List<Integer>obj2=new ArrayList<>();
         obj2.add(67);
         obj2.add(16);
         obj2.add(45);
         System.out.println("list 3 is:"+obj2);
         //to sort it ascending order
         Collections.sort(obj2);
         System.out.println("ascending order:"+obj2);
         Collections.reverse(obj2);
         System.out.println("descending order:"+obj2);
	}

}