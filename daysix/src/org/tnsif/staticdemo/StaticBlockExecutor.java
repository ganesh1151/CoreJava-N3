package org.tnsif.staticdemo;
//driver class
public class StaticBlockExecutor {

	public static void main(String[] args) {
		//without creating object
		System.out.println(StaticBlock.getName());
		
		
		//with creating object
		StaticBlock s=new StaticBlock();
		s.setNum(145);
		System.out.println(s.getNum());

	}

}
