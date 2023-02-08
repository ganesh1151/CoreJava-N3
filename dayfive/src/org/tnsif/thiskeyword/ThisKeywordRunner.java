package org.tnsif.thiskeyword;
//4) this can be use to return the current class instance
class Mathematics {
	int a,b;
	Mathematics(){
		a=10;
		b=20;
	}
	
	Mathematics accept(){
		return this;
	}
	
	void display() {
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
	}
}
public class ThisKeywordRunner {

	public static void main(String[] args) {
		Mathematics m=new Mathematics();
		//m.display();
		m.accept().display();

	}

}
