package org.tnsif.singleinheritance;
// to demonstrate on single level inheritance
public class Citizen {
	//private data members
     private String adharno;
     private String name;
     private String city;
     private long mbno;
     //getters and setters
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMbno() {
		return mbno;
	}
	public void setMbno(long mbno) {
		this.mbno = mbno;
	}
	//default constructor
	public Citizen() {
		System.out.println("parent class ");
	}
	//parameterized constructor
	public Citizen(String adharno, String name, String city, long mbno) {
		super();
		this.adharno = adharno;
		this.name = name;
		this.city = city;
		this.mbno = mbno;
	}
	@Override
	public String toString() {
		return "Citizen [adharno=" + adharno + ", name=" + name + ", city=" + city + ", mbno=" + mbno + "]";
	}
}