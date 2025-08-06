package com.tnsif.bankingsystem;

public class SavingsAccount extends Account {

	public SavingsAccount(String acNo) {
		super(acNo);
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited Rs."+amount+" to savings account");
	}

	@Override
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew Rs."+amount+" from savings account");
		}else {
			System.out.println("Insufficient balance");
		}
	}

	@Override
	public double getBalance() {
		return balance;
	}

	
	
}
