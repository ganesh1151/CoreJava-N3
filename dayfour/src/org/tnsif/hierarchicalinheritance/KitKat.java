package org.tnsif.hierarchicalinheritance;

public class KitKat extends AndroidVersion {
       private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	/*public KitKat() {
		super();
		// TODO Auto-generated constructor stub
	}*/

	public KitKat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KitKat(String type,int version) {
		super();
		this.version = version;
	}

	@Override
	public String toString() {
		return "KitKat [version=" + version + "]";
	}
       
}