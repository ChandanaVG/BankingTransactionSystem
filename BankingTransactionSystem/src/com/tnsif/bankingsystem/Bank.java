package com.tnsif.bankingsystem;

public class Bank {
	
	private static int totalAccounts = 0;
	
	public static int getTotalAccounts() {
		return totalAccounts;
	}
	
	public static void incrementAccount() {
		totalAccounts++;
	}
}
