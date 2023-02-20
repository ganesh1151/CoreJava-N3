package org.tnsif.hierarchicalinheritance;

public class AndroidVersion {
    private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AndroidVersion() {
		System.out.print("parent class-Android version");
	}
	

	public AndroidVersion(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "AndroidVersion [type=" + type + "]";
	}
    
}