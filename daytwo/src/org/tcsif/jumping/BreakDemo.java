package org.tcsif.jumping;


//to demonstrate example on "Break Statement"
public class BreakDemo {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
			if(i==4)
				break;
		}

	}

}

//OUTPUT
/*
1 2 3 4 
*/