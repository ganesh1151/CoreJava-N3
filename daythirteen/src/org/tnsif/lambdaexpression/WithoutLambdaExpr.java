package org.tnsif.lambdaexpression;

//Program to demonstrate without lambda expression 
//Functional interface which contains exactly one abstract method
interface Message
{
	void greet(String name);
	
}

//implementable class for an interface
//without lambda expression
/*class MessageImpl implements Message
{

	@Override
	public void greet(String name) {
		System.out.println("Hello "+name);
		
	}
	
}*/
//without Lambda Expression
public class WithoutLambdaExpr {

	public static void main(String[] args) {
		
		//without lambda expression
		/*MessageImpl i=new MessageImpl();
		i.greet("Shiwani");*/
		
		//without lambda, Message implementation using anonymous class
		Message m=new Message()
		{

			@Override
			public void greet(String name) {
				System.out.println("Hello "+name);
				
			}
			
			
		};
		m.greet("Shiwani");
		
		//using Lambda Expression
		Message obj=(name)->
		{
			System.out.println("Hello "+name);

		};
		obj.greet("Jenny");
	}

}