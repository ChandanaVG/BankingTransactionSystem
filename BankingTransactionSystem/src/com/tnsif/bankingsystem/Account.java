package com.tnsif.bankingsystem;

public abstract class Account {
	
	protected String acNo;
	protected double balance;
	
	public Account(String acNo) {
		this.acNo = acNo;
		this.balance = 0.0;
		Bank.incrementAccount();
	}
	
	public String getAcNo() {
		return acNo;
	}
	
	public void setAcNo(String acNo) {
		this.acNo = acNo;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract double getBalance();
	
	
}
