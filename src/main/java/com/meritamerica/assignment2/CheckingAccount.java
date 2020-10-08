package com.meritamerica.assignment2;



/*
 * This is the definition of the CheckingAccount class.
 * This class simulates the checking account of an account holder
 * within a banking application.
 */
public class CheckingAccount extends BankAccount {
	
	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(double openingBalance, double interestRate) {
		super(openingBalance, interestRate);
	}
	private double interestRate = 0.0001;
	
}