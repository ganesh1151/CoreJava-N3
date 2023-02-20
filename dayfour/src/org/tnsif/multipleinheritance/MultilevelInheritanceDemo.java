package org.tnsif.multipleinheritance;
//driver class 
import java.util.Scanner;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the model no ,version,slottype");
		int modelno=s.nextInt();
		s.nextLine();
		String version=s.nextLine();
		String slottype =s.nextLine();
		Iphone i=new Iphone();
		Iphone i1=new Iphone(modelno,version,slottype);
		i1.setModelno(modelno);
		i1.setVersion(version);
		i1.setSlottype(slottype);
		i1.slot();
		i1.accept();
		i1.display();
		System.out.println(i1);
	}
     
}