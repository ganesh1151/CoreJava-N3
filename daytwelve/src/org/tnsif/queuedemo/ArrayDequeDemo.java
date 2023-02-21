package org.tnsif.queuedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		Deque<String>obj=new ArrayDeque<>();
		
		//insted of add we can use offer
		obj.offer("Ganesh");
		obj.addFirst("Shubham");
		obj.addLast("Amol");
		
	
		//extract the elements from deque
		for(String itr:obj) {
			System.out.print(itr+" ");
		}
		System.out.println("Array deque element are :" +obj);
		obj.remove();
		System.out.println("Array deque element are :" +obj);
		obj.removeFirst();
		System.out.println("Array deque element are :" +obj);
		obj.removeLast();
		System.out.println("Array deque element are :" +obj);
	}
}
