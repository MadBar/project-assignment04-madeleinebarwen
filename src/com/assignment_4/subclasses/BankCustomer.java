package com.assignment_4.subclasses;

import java.util.ArrayList;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

/**
 * @author mads
 *
 */
public class BankCustomer extends Human {

	private ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();
	// Object bla;

	/**
	 * @param name
	 * @param age
	 */
	public BankCustomer(String name, int age) {
		super(name, age);

	}

	/**
	 * @return
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * @param customerAccounts
	 */
	public void setCustomerAccounts(
			ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	/**
	 * @param bankAccount
	 */
	public void addAccount(BankAccount bankAccount) {
		// How to add an object to arraylist?
		// ba = bankAccount;
		customerAccounts.add(bankAccount);
	}

	/**
	 * @param accountNumber
	 * @param amount
	 */
	public void depositToAccount(String accountNumber,
			double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber()
					.equals(accountNumber)) {
				customerAccounts.get(i)
						.depositMoney(amount);
			}
		}
	}

	/**
	 * @param accountNumber
	 * @param amount
	 */
	public void withdrawFromAccount(String accountNumber,
			double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber()
					.equals(accountNumber)) {
				customerAccounts.get(i)
						.withdrawMoney(amount);
			}
		}
	}

	// Needs much work. Loop to write out Accounts? Check chain, what happens
	// where?
	@Override
	public String toString() {

		String returnString = "Customer: " + getName()
				+ ", Age: " + getAge() + "\n";

		for (int i = 0; i < customerAccounts.size(); i++) {
			returnString = returnString
					+ customerAccounts.get(i).toString()
					+ "\n";
		}

		return returnString;
		// return "Customer: " + getName() + ", Age: "
		// + getAge() + "\n" + customerAccounts.get(0)
		// + "\n" + customerAccounts.get(1) + "\n"
		// + customerAccounts.get(2) + "\n";
	}

}
