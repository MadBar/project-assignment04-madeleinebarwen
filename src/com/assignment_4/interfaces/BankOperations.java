package com.assignment_4.interfaces;

/**
 * @author mads
 * This is an Interface it has two methods, named bla and bla.
 */
public interface BankOperations {
	
	/**
	 * 
	 * This is a method that is used to withdraw money from an account.
	 *@param amount
	 */
	public void withdrawMoney(double amount);

	/**
	 * @param amount
	 */
	public void depositMoney(double amount);
}
