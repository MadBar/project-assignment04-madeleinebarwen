package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

/**
 * This is a class called PersonalAccount that extends BankAccount. Has a constructor method.
 * 
 * @author Madeleine Barwen
 */
public class PersonalAccount extends BankAccount {

	/**
	 * Constructor method that sets values to a PersonalAccount
	 */
	public PersonalAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
		this.setBalance(0.0);
		this.setAccountType("Personal account");
	}

}
