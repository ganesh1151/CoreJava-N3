package org.tnsif.streamapidemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//program to demonstrate on Basic Stream
public class WorkingWithStream {

	public static void main(String[] args) {
		Stream<String>obj=Stream.of("Pallavi","Harshada","Rutuja");
		//forEach -terminal operation
		obj.forEach((i)->System.out.print(i+" "));
		
		System.out.println();
		//stream can be accquired from array or collection
		List<Integer>obj1=Arrays.asList(new Integer[] {11,45,78,90});
		obj1.forEach((i)->System.out.print(i+" "));

	}

}