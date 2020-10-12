package com.meritamerica.assignment2;


import java.util.Date;

public class CDAccount extends BankAccount {
	
	private CDOffering offering;
	private double balance;
	private Date startDate;

	public CDAccount(CDOffering offering, double balance) {
		this.startDate = new Date();
		
		this.offering = offering;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return offering.getInterestRate();
	}
	
	public int getTerm() {
		return offering.getTerm();
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public long getAccountNumber() {
		return super.getAccountNumber();
	}
	
	public double futureValue() {
		double interestRate = offering.getInterestRate();
		int years = offering.getTerm();
		
		return balance * (Math.pow(1 + interestRate, years));
	}
	
}
