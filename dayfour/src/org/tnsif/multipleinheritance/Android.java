package org.tnsif.multipleinheritance;

public class Android extends Nokia{
      private String version;
      public void accept() {
    	  System.out.print("the android version name is:"+version);
      }
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	//public Android() {
		//super();
		// TODO Auto-generated constructor stub
	//}
	public Android() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Android(String version) {
		super();
		this.version = version;
	}
      
}