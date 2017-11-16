package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

/**
 * This is a class called SvaingAccount that extends BankAccount. Has a constructor method.
 * 
 * @author Madeleine Barwén
 */
public class SavingAccount extends BankAccount {

	/**
	 * Constructor method that sets values to a SavingAccount
	 */
	public SavingAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
		this.setBalance(0.0);
		this.setAccountType("Saving account");
	}

}
