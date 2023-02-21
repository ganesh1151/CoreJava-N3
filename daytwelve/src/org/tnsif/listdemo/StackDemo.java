package org.tnsif.listdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		obj.push("shital");
		obj.push("pratik");
		obj.push("bhushan");
		obj.push("gauri");
		System.out.println("the element inside the stack are:"+"are:"+obj);
		obj.pop();
		System.out.println("the element inside the stack are:"+"are:"+obj);
	}

}