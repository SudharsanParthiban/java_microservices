package com.Loan.model;

public class Loan {
	 
	private long accNum;
	private String acctype;
	private double lAmount;
	public Loan(long accNum, String acctype, double lAmount) {
		super();
		this.accNum = accNum;
		this.acctype = acctype;
		this.lAmount = lAmount;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public double getlAmount() {
		return lAmount;
	}
	public void setlAmount(double lAmount) {
		this.lAmount = lAmount;
	}
	
	

}
