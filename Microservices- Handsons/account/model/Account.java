package com.account.model;

public class Account {
	
	private long accNum;
	private String accType;
	private double balance;
	public Account(long accNum, String accType, double balance) {
		super();
		this.accNum = accNum;
		this.accType = accType;
		this.balance = balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
