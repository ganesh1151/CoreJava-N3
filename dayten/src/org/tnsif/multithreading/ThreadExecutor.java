package org.tnsif.multithreading;

public class ThreadExecutor {

	public static void main(String[] args) {
		SimpleThreadProgram p=new SimpleThreadProgram();
		//used to changed the thread name
		p.setName("java thread");
		//used to changed the priority
        p.setPriority(8); 
      //when thread calls to start method it will come to run method
        p.start();
        /* once we called the start() method ,again we can't restart
        p.start();*/
        System.out.println("current thread"+p);
	}

}