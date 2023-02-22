package org.tnsif.streamapidemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//program to demonstrate on mapping 
public class MappingDemo {
	public static void main(String[] args) {
		//Mapping
		//Map return an array of piece of information from the original array
		List<String>words=Arrays.asList("Nia","Divya","Pihu");
		words.stream().map(itr->itr.length()).forEach((itr)->System.out.print(itr+" "));
		System.out.println();
		//to count the length of the string
		List<String> words1 = Arrays.asList("IGATE","GLOBAL","SOLUTIONS");
		List<Integer> counts = words1.stream().map(str->str.length()).collect(Collectors.toList());
		counts.forEach((str)->System.out.print(str+" "));
		
	}

}