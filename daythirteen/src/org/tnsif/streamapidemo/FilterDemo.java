package org.tnsif.streamapidemo;
import java.util.Arrays;
import java.util.List;
//Filter return the subset of an original array based on the custom criteria
//program to demonstrate on filter method
public class FilterDemo {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList("Diya","Nayana","Shweta","Diya");
		
		//filter(predicate)
		obj.stream().filter((i->i.length()>4)).forEach((i)->System.out.print(i+" "));
		System.out.println();
		//distinct
		obj.stream().distinct().forEach((i)->System.out.print(i+" "));
		System.out.println();
		//limit(n)
		obj.stream().limit(2).forEach((i)->System.out.print(i+" "));
		System.out.println();
		//skip(n)
		obj.stream().skip(2).forEach((i)->System.out.print(i+" "));
	}

}