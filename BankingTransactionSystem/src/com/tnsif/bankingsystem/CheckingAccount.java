package com.tnsif.bankingsystem;

public class CheckingAccount extends Account {
	
	public CheckingAccount(String acNo) {
        super(acNo);
    }

	@Override
	public void deposit(double amount) {
		balance += amount;
        System.out.println("Deposited Rs." + amount + " to Checking Account.");
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew Rs. " + amount + " from Checking Account.");
        } else {
            System.out.println("Insufficient balance in Checking Account.");
        }
	}

	@Override
	public double getBalance() {
		return balance;
	}

}
