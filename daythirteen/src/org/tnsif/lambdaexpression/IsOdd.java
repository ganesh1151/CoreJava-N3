package org.tnsif.lambdaexpression;
//program to demonstrate on Lambda Expression to implement functional interface
/*below annotation ensures that interface contains only 
one abstract method*/
@FunctionalInterface
public interface IsOdd {
	boolean checkOdd(int a);

}