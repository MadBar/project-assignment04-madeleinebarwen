package com.assignment_4.superclasses;

import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;

/**
 * This is a class called BankAccount that implements Interface BankOperations.
 * It has a 3 attributes with getters and setters, constructor method and 3
 * overridden methods)
 * @author Madeleine Barwén
 */
public class BankAccount implements BankOperations {
	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0.0;

	/**
	 * 
	 */
	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0;
		this.accountType = "Bank account";
	}

	/**
	 * @return
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountName
	 */
	public void setAccountNumber(String accountName) {
		this.accountNumber = accountName;
	}

	/**
	 * @return
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 */
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
		return "BankAccount [accountNumber = " + accountNumber + ", accountType = " + accountType + ", balance = "
				+ balance + "]";
	}

}
