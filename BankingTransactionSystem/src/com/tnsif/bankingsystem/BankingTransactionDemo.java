package com.tnsif.bankingsystem;

public class BankingTransactionDemo {

	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount("123");
		CheckingAccount ca = new CheckingAccount("567");
		
		Transaction ts = new Transaction();
		
		ts.performTransaction(sa, "deposit", 20000);
		ts.performTransaction(ca, "deposit", 100000);
		
		ts.performTransaction(sa, "withdraw", 30000);
		ts.performTransaction(ca, "withdraw", 99996);
		
		ts.performTransaction(sa, "withdraw", 15000);
		ts.performTransaction(ca, "withdraw", 10000);
		
		System.out.println("Total number of accounts"+Bank.getTotalAccounts());
	}

}
