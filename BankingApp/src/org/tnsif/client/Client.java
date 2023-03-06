package org.tnsif.client;

import java.util.Scanner;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		 MMBankFactory f=new  MMBankFactory();
		 MMSavingAcc s=new MMSavingAcc(50000, "Ganesh", 5000, true);
		 MMCurrentAcc c=new MMCurrentAcc(230202, "Shubham", 10000, 600);
		 
		 
		 
		  //Saving account 
		 System.out.println("SAVING aCCOUNT ");
		 System.out.println(s);
		
		 s.withdraw(s.getAccBal());
		 // current account 
		 System.out.println(" CURRENT ACCOUNT");
		 System.out.println(c);
		 //s.deposite(s.getAccBal());
		 c.withdraw(c.getAccBal());
		 
	}

}