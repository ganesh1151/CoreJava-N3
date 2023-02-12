package org.tnsif.stringdemo;
//program to demonstrate on stringBuffer
public class StringBufferDemo {

	public static void main(String[] args) {
		// length vs capacity
		StringBuffer sb=new StringBuffer("Ganesh");
		System.out.println(sb);
		
		//bydefault is it 16 + lenght of string(6)=22
		System.out.println(sb.capacity());  //bydefault its 16 
		System.out.println(sb.length());

		
		String str;
		int a=34; 
		sb=new StringBuffer(40);
		str=sb.append(a).toString();
		System.out.println(str);
		System.out.println(sb);   //34
		System.out.println(sb.reverse());  //43
	}

}
