package org.tnsif.multithreading;
//a class used to send a message
public class Sender {
    public void sendMessage(String message)
    {
    	System.out.println("\nSending"+message);

	    try
	    {
	    	Thread.sleep(1000);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Thread interrupted");
	    }
    }
}
    