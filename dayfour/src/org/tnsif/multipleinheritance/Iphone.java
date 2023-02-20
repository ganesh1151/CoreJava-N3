package org.tnsif.multipleinheritance;
//child class
public class Iphone extends Android {
     private String slottype;
     public void slot() {
    	 System.out.println("slottype is:"+slottype);
     }
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	public Iphone() {
		super();
		
	}
	public Iphone(int modelno,String version,String slottype) {
		super();
		this.slottype = slottype;
	}
	@Override
	public String toString() {
		return "Iphone [slottype=" + slottype + ", getVersion()=" + getVersion() + ", getModelno()=" + getModelno()
				+ "]";
	}
	
     
}