package org.tnsif.multithreading;
//class sending a message using threads
public class SendUsingThread extends Thread {
     private String message;
     Sender sender;
     //receieves a messages object and a string message to be sent
     SendUsingThread(String msg,Sender object){
    	 message=msg;
    	 sender=object;
     }
     public void run() {
    	 //this will ensure that only one thread send message at a time
     }
}