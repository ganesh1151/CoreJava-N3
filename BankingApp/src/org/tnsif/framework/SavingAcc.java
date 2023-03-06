package org.tnsif.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float MINBAL = 2000f;

	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float MINBAL )
	
	{
		System.out.println("Acount no is"+this.getAccNo()+" "+"acoount name is: "+this.getAccNm()
		+" "+"Account balance is :"+this.getAccBal()+" minimum balcance limit is:"+this.MINBAL);
		
		/*if(accBal== MINBAL)
		{
			System.out.print("Low Balance u cannot withdraw");
		}*/
		
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
	

}