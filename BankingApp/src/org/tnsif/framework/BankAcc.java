package org.tnsif.framework;

public abstract class BankAcc 
{

   private int accNo;
   private  String accNm;
   private float accBal;
   // getter and setter 
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getAccNm() {
	return accNm;
}
public void setAccNm(String accNm) {
	this.accNm = accNm;
}
public float getAccBal() {
	return accBal;
}
public void setAccBal(float accBal) {
	this.accBal = accBal;
}
// constructor using fields 
public BankAcc(int accNo, String accNm, float accBal) {
	super();
	this.accNo = accNo;
	this.accNm = accNm;
	this.accBal = accBal;
}
@Override
public String toString() {
	return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
}
 public abstract void withdraw (float accBal );
    
 public void deposite(float accBal)
 {
	 System.out.println(accBal);
 }
 
}
