package org.tnsif.framework;

public abstract class CurrentAcc extends BankAcc  {
	final private float creditLmit  ;
// constructor 
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLmit) {
		super(accNo, accNm, accBal);
		this.creditLmit = creditLmit;
		
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLmit=%s]", creditLmit);
	}


	public void withdraw(float accBal)
	{
		/*if(accBal==creditLmit )
		{
			System.out.println(" you cant'n withdraw below creditlimit");
		}*/
		System.out.println("Acount no is"+this.getAccNo()+" "+"acoount name is:"+this.getAccNm()
		+" "+"Account balance is :"+this.getAccBal()+" "+"credit limit is:"+this.creditLmit);
	}
	

}