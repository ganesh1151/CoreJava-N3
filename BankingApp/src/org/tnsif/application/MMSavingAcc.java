package org.tnsif.application;

import org.tnsif.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	// constructor
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	
		
	
	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + "]";
	}
	
	

}