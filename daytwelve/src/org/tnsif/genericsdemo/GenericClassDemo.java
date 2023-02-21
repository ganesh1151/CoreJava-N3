package org.tnsif.genericsdemo;

class GenericClass<T> {

		T x;
		void dispaly(T x) 
		{
			this.x=x;
		}
		T accept()
		{
			return x;
		}

		
	}

public class GenericClassDemo{
	public static void main(String[] args) {
		GenericClass<String>obj1=new GenericClass<String>();
		obj1.dispaly("gayatri");
		//obj1.display(11);
		System.out.println(obj1.accept());
	}
}