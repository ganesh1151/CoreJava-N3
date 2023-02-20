package org.tnsif.multithreading;
//driver class
//program to demonstrate on synchronized method
public class SynchronizationDemoExecutor {

	public static void main(String[] args) {
		SynchronizationDemo obj=new SynchronizationDemo();
		Threadone t1=new Threadone(obj);
		Threadtwo t2=new Threadtwo(obj);
		t1.start();
		t2.start();
	}

}