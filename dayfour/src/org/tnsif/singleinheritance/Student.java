package org.tnsif.singleinheritance;

public class Student extends Citizen{
	//private data members
     private int rollno;
     private String studname;
     
     //geterrs and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public Student() {
		super();
	}
	
	public Student(String adharno,String name,String city,long mbno,int rollno, String studname) {
		super(adharno,name,city,mbno);
		
		this.rollno = rollno;
		this.studname = studname;
	}
	//@Override
	//public String toString() {
		//return "Student [rollno=" + rollno + ", studname=" + studname + "]";
	//}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studname=" + studname + ", getRollno()=" + getRollno()
				+ ", getStudname()=" + getStudname() + ", getAdharno()=" + getAdharno() + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + ", getMbno()=" + getMbno() + "]";
	}
     																																																																																																																																																																						
}