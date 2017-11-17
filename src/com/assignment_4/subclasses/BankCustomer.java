package com.assignment_4.subclasses;

import java.util.ArrayList;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

/**
 * This is a class called BankCustomer that extends the Interface Human. It has
 * one attribut, getters and setters for that attribut and 3 more methods
 * (should you count toString? I haven't). It also has a constructor taking 2
 * parameters.
 * 
 * @author Madeleine Barwen
 */
public class BankCustomer extends Human {

	private ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	/**
	 * Constructor method.
	 * 
	 * @param name
	 * @param age
	 */
	public BankCustomer(String name, int age) {
		super(name, age);

	}

	/**
	 * Method that returns customerAccounts
	 * 
	 * @return
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * Method that sets customerAccounts
	 * 
	 * @param customerAccounts
	 */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	/**
	 * Method that adds a bank account
	 * 
	 * @param bankAccount
	 */
	public void addAccount(BankAccount bankAccount) {
		customerAccounts.add(bankAccount);
	}

	/**
	 * Method that deposits money to an account.
	 * 
	 * @param accountNumber
	 * @param amount
	 */
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}

	/**
	 * Method that withdraws money from an account.
	 * 
	 * @param accountNumber
	 * @param amount
	 */
	public void withdrawFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}

	@Override
	public String toString() {

		String returnString = "Customer: " + getName() + ", Age: " + getAge() + "\n";

		for (int i = 0; i < customerAccounts.size(); i++) {
			returnString = returnString + customerAccounts.get(i).toString() + "\n";
		}

		return returnString;
		// return "Customer: " + getName() + ", Age: "
		// + getAge() + "\n" + customerAccounts.get(0)
		// + "\n" + customerAccounts.get(1) + "\n"
		// + customerAccounts.get(2) + "\n";
	}

}
