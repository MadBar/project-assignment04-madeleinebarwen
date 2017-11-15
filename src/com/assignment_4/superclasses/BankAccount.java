package com.assignment_4.superclasses;

import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;

public class BankAccount implements BankOperations {
	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0.0;

	public BankAccount() {
		// need this autogen?
		// super();

		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0;
		this.accountType = "Bank account";
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountName) {
		this.accountNumber = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void withdrawMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("You can't withdraw a negative value!");
		}

	}

	@Override
	public void depositMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() + amount);
		} else {
			System.out.println("You can't deposit a negative value!");
		}

	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber = " + accountNumber + ", accountType = " + accountType + ", balance = " + balance
				+ "]";
	}

}
