package org.tnsif.queuedemo;

import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueDemo {
	public static void main(String[] args) {
		Queue<Integer>obj=new PriorityQueue<>();
		
		// add and offer method is used to insert an element
		obj.offer(13);
		obj.add(67);
		obj.add(5);
		obj.add(91);
		obj.add(15);
		System.out.println("Queue elements are :" +obj);
		obj.remove();
		
		// poll ->[]  and remove ->exception
		System.out.println("Queue elements are :" +obj);
		obj.poll();
		//obj.poll();
		//obj.poll();
		
		
		obj.poll();
		System.out.println("Queue elements are :" +obj);
		
		System.out.println("Queue peek elements are :" +obj.peek());
	}
}
