package com.meritamerica.assignment2;


public class MeritAmericaBankApp {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		System.out.println("Hello Merit America!");

		AccountHolder accountHolder = new AccountHolder("Sam", "John", "Houston", "633378899");

		accountHolder.addCheckingAccount(1000);
		accountHolder.addCheckingAccount(5000);

		accountHolder.addSavingsAccount(10000);
		accountHolder.addSavingsAccount(10000);
		
		
		
	}
}