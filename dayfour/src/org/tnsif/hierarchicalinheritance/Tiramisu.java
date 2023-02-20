package org.tnsif.hierarchicalinheritance;

public class Tiramisu extends AndroidVersion {
    private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Tiramisu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tiramisu(String type,int version) {
		super();
		this.version = version;
	}

	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
    
}