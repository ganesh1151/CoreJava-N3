package org.tnsif.jumping;

//to demonstrate example on "Continue Statement"
public class ContinueDemo {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==4)
				continue;
			System.out.print(i+" ");
		}
	}

}


//OUTPUT
/*
1 2 3 5 6 7 8 9 10 
*/
