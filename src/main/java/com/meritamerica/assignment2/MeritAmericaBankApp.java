package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");

		AccountHolder accountHolder = new AccountHolder("Sam", "John", "Houston", "633378899");

		accountHolder.addCheckingAccount(1000);
		accountHolder.addSavingsAccount(10000);

		// assertEquals("Sam", accountHolder.getFirstName());
		// assertEquals("John", accountHolder.getMiddleName());
		// assertEquals("Houston", accountHolder.getLastName());
		// assertEquals("633378899", accountHolder.getSSN());
		// assertEquals(1000, accountHolder.getCheckingBalance(),0);
		// assertEquals(10000, accountHolder.getSavingsBalance(),0);
	}
}