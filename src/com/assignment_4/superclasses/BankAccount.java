package com.assignment_4.superclasses;

import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;

/**
 * This is a class called BankAccount that implements Interface BankOperations.
 * It has a 3 attributes with getters and setters, constructor method and 3
 * overridden methods)
 * 
 * @author Madeleine Barwen
 */
public class BankAccount implements BankOperations {
	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0.0;

	/**
	 * Constructor Method that sets values to a BankAccount
	 */
	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0;
		this.accountType = "Bank account";
	}

	/**
	 * Getter Method for accountNumber attribute
	 * @return accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Setter Method for accountNumber attribute
	 * @param accountName
	 */
	public void setAccountNumber(String accountName) {
		this.accountNumber = accountName;
	}

	/**
	 * Getter Method for accountType attribute
	 * @return accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * Setter Method for accountType attribute
	 * @param accountType
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * Getter Method for balance attribute
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Setter Method for balance attribute
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
