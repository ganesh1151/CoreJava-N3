package org.tnsif.thiskeyword;
//3)
class HR{
	void display(HR obj) 
	//void display()
	{
		System.out.println("Human Resource");
	}
	
	void accept()
	{
		display(this);
		//display()
	}
}
public class ThisKeywordExecutor {

	
	public static void main(String[] args) {
		HR obj=new HR();
		obj.accept();

	}

}
