package org.tnsif.setdemo;

import java.util.LinkedHashSet;
import java.util.Set;
//driver code
//program to demonstrate on user defined objects
public class StudentSetExecutor {
	
	
	//user-defined method
	public static void addStudent(Set<Student>obj) {
		Student student1=new Student(101,"Ganesh",19.20f);
		Student student2=new Student(102,"Gaurav",39.20f);
		Student student3=new Student(103,"Hrushikesh",99.20f);
		obj.add(student1);
		obj.add(student2);
		obj.add(student3);
		}
	
	
	public static void main(String args) {
		Set<Student>obj=new LinkedHashSet<>();
		addStudent(obj);
		System.out.println(obj);
	}

}
