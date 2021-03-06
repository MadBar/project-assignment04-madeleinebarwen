package com.assignment_4.main;

import com.assignment_4.subclasses.BankCustomer;
import com.assignment_4.subclasses.PersonalAccount;
import com.assignment_4.subclasses.SavingAccount;
import com.assignment_4.superclasses.BankAccount;

/**
 * Main Class for Assignment 04.
 * 
 * @author Madeleine Barwen
 * @version 1.0
 */
public class Main {

	/**
	 * In the Main method we intanciate an object of the class BankCustomer, adds
	 * accounts to them, deposits and deducts money to/from the accounts and then
	 * prints the customer out to the screen.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String account = "";

		BankCustomer bc = new BankCustomer("Mad", 30);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.println(bc.toString());

		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("Depositing 30.0 to the first account");
		bc.depositToAccount(account, 30);
		System.out.println(bc.toString());

		System.out.println("Withdrawing 200.0 from the second account");
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		bc.withdrawFromAccount(account, 200);
		System.out.println(bc.toString());

		System.out.println("Depositing 200 to the third account");
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		bc.depositToAccount(account, 200);
		System.out.println(bc.toString());

	}

}
