package org.tnsif.multithreading;

public class SynchronizationDemo {
    synchronized void print(int num) throws InterruptedException{
    	  for(int i=1;i<=5;i++) {
    		  System.out.println(num*i);
    	  }
    	  
      }
}
//thread one 
class Threadone extends Thread{
	SynchronizationDemo d;

	public Threadone(SynchronizationDemo d) {
		super();
		this.d = d;
	}
	public void run() {
		try {
			d.print(10);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
} 
//thread two
class Threadtwo extends Thread{
	SynchronizationDemo d;
	
	public Threadtwo(SynchronizationDemo d) {
		super();
		this.d = d;
	}

	public void run() {
		try {
			d.print(10);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}	
		}
}