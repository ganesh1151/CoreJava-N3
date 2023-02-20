package org.tnsif.multithreading;
import java.lang.Thread;
public class ThreadDemo {
            public static void main(String[] args) {
				Thread t=Thread.currentThread();
				System.out.println("current thread:"+ t);
				try {
					Thread.sleep(1);
				}
				catch(InterruptedException e){
					System.out.println("main thrad interrupted");
				}
			}
}