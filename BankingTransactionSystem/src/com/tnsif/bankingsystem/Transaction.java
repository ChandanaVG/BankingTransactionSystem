package com.tnsif.bankingsystem;

public class Transaction {
	
	private final double transactionFee = 5.0;
	
	public final void performTransaction(Account ac, String type, double amount) {
		System.out.println("Transaction processing........");
		
		if(type.equalsIgnoreCase("deposit")){
			ac.deposit(amount);
		}else if(type.equalsIgnoreCase("withdraw")) {
			if((amount + transactionFee) <= ac.getBalance() ) {
				ac.withdraw(amount);
				System.out.println("withdrew Rs." +amount);
			}else {
				System.out.println("Insufficient balance.");
			}
		}else {
			System.out.println("Invalid type");
		}
		System.out.println("Balance : Rs."+ac.getBalance());
		System.out.println("Transaction done!");
	}
}
