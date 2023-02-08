package org.tnsif.thiskeyword;

//2) this can be passes as argument in the constructor call

public class ThisKeywordExample {

	int num;
	
	public ThisKeywordExample() {
		
	}
	public ThisKeywordExample(int num) {
		
		this.num = num;
	}

	

	public static void main(String[] args) {
		
		ThisKeywordExample obj=new ThisKeywordExample(5);
		System.out.println("Num value :"+obj.num);

	}

}
