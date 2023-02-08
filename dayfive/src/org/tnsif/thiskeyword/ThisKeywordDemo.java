package org.tnsif.thiskeyword;
//1) It can be used to refer instance variable of current class
class Account{
	int a;
	int b;
	public void setdata(int a,int b) {
		
		//use this keyword or change the method argument name
		this.a=a;
		this.b=b;
	}
	
	public void showdata() {
		System.out.println("The Value of A = "+a);
		System.out.println("The Value of B = "+b);
	}
}
public class ThisKeywordDemo {
	
	
	public static void main(String[] args) {
		
		Account obj=new Account();
		obj.setdata(11, 12);
		obj.showdata();
	}

}
