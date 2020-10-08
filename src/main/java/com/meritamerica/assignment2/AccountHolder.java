package com.meritamerica.assignment2;


/*
 * This is the definition of the AccountHolder class.
 * It is meant to simulate an account holder of a banking application.
 */
public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	
	// the account holder class needs to be able to have unlimited bank account objects
	// for now, an account holder can only have 2 below.
	// maybe we can implement an ArrayList  or an array here.
	private BankAccount checkingAccount;
	private BankAccount savingsAccount;
	
	/*
	 * no arg constructor
	 */
	public AccountHolder() {
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.ssn = "";
		
		this.checkingAccount = new CheckingAccount();
		this.savingsAccount = new SavingsAccount();
	}

	/*
	 * This constructor receives and argument for every field.
	 */
	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	//
	// Accessors and mutators
	//
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public BankAccount getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public BankAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * 
	 * returns the state of the object as a string.
	 */
	@Override
	public String toString() {
		return generateStringForToString();
	}
	
	/*
	 * returns a string to be used in the toString method.
	 */
	private String generateStringForToString() {
		StringBuilder str = new StringBuilder();
		
		// append the name
		str.append("Name: " + getFirstName() + " " + 
					getMiddleName() + " " + 
					getLastName() + "\n");
		
		// append social security number
		str.append("SSN: " + getSsn() + "\n");
		
		// append checking account balance
		// append checking account interest rate
		// append checking account balance in 3 years
		str.append(getCheckingAccount().toString());
		
		// append savings account balance
		// append savings account interest rate
		// append the savings account balance in 3 years
		str.append(getSavingsAccount().toString());
		
		// return the StringBuilder object as a string.
		return str.toString();
	}	
}