package com.meritamerica.assignment2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CDAccount extends BankAccount {
	
	private CDOffering offering;
	private double balance;
	
	public CDAccount(CDOffering offering, double balance) {
		super();
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
		Date date = new Date();
		
		return date;
	}
	
	public long getAccountNumber() {
		return getAccountNumber();
	}
	
	public double futureValue() {
		return futureValue();
	}
	
	
	

}
