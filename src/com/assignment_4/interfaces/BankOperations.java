package com.assignment_4.interfaces;

/**
 * This is an Interface it has two methods: withdrawMoney, depositMoney.
 * 
 * @author Madeleine Barwen
 */
public interface BankOperations {
	
	/**
	 * This void method is used to withdraw money from an account.
	 *@param amount
	 */
	public void withdrawMoney(double amount);

	/**
	 * This method is used to deposit money to an account.
	 * @param amount
	 */
	public void depositMoney(double amount);
}
