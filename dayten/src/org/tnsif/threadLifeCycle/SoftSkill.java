package org.tnsif.threadLifeCycle;
//program to demonstrate on thread life cycle 
public class SoftSkill extends Thread{
	public void run() {
		System.out.println("Professional Ethics ");
		for(int i=1;i<=5;i++) {
			System.out.println(i+" ");
			
		}
		System.out.println("Soft-Skill Session");
	}
}
