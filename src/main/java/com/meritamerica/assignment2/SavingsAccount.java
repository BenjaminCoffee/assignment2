package com.meritamerica.assignment2;



/*
 * This is the definition of the SavingsAccount Class.
 * This class simulates the savings account of an account holder.
 */
public class SavingsAccount extends BankAccount {
	
	private double interestRate = 0.01;
	
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(double openingBalance) {
		super(openingBalance);
	}
	
	public SavingsAccount(double openingBalance, double interestRate) {
		super(openingBalance, interestRate);
	}
	
	
	
	
}