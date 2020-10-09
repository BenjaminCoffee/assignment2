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
	private CheckingAccount[] checkingAccounts;
	private SavingsAccount[] savingsAccounts;
	private CDAccount[] cdAccount;
	
	/*
	 * no arg constructor
	 */
	public AccountHolder() {
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.ssn = "";
		
		this.checkingAccounts = new CheckingAccount[0];
		this.savingsAccounts = new SavingsAccount[0];
		this.cdAccount = new CDAccount[0];
	}

	/*
	 * This constructor receives and argument for every field.
	 */
	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	
	public SavingsAccount addSavingsAccount(double openingBalance) {
		SavingsAccount newAccount = new SavingsAccount(openingBalance);
		
		SavingsAccount[] currentArray = getSavingsAccount();
		
		SavingsAccount[] newSavingsAccountArray = new SavingsAccount[currentArray.length + 1];
		
		for(int i = 0; i < currentArray.length; i ++) {
			newSavingsAccountArray[i] = currentArray[i];
		}
		
		newSavingsAccountArray[newSavingsAccountArray.hashCode()] = newAccount;
		
		this.savingsAccounts = newSavingsAccountArray;
		
		
		return newAccount;
	}
	
	/*
	 * When a new CheckingAccount object is added to the checkingAccounts array
	 * a new array will be created.
	 * The old contents of the checkingAccounts array must be copied in to a 
	 * new array along with the new CheckingAccount object.
	 * The new array is then assigned back to the checkingAccounts array.
	 */
	public CheckingAccount addCheckingAccount(double openingBalance) {
		
		CheckingAccount newAccount = new CheckingAccount(openingBalance);
		
		if(currentArray == null) {
			currentArray = new CheckingAccount[0];
			
			newCheckingAccountArray[0] = newAccount;
			
			CheckingAccount[] newCheckingAccountArray = newAccount;
		}
		
		CheckingAccount[] currentArray = getCheckingAccount();
		
		
		
		int currentArrayLength = 0;
		
		
		
		
		
		
		for(int i = 0; i < currentArray.length; i ++) {
			newCheckingAccountArray[i] = currentArray[i];
		}
		
		
		this.checkingAccounts = newCheckingAccountArray;
		
		
		return newAccount;
	}
	
	public double getCheckingBalance() {
		CheckingAccount[] currentCheckingAccount = getCheckingAccount();
		double checkingBalance = 0;
		
		for(int i = 0; i < currentCheckingAccount.length; i++) {
			checkingBalance = checkingBalance + currentCheckingAccount[i].getBalance();
		}
		
		return checkingBalance;
	}
	
	public double getSavingsBalance() {
		SavingsAccount[] currentSavingsAccount = getSavingsAccount();
		double savingsBalance = 0;
		
		for(int i = 0; i < currentSavingsAccount.length; i++) {
			savingsBalance = savingsBalance + currentSavingsAccount[i].getBalance();
		}
		
		return savingsBalance;
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

	public String getSSN() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public CheckingAccount[] getCheckingAccount() {
		return checkingAccounts;
	}

	public void setCheckingAccount(CheckingAccount[] checkingAccount) {
		this.checkingAccounts = checkingAccount;
	}

	public SavingsAccount[] getSavingsAccount() {
		return savingsAccounts;
	}

	public void setSavingsAccount(SavingsAccount[] savingsAccount) {
		this.savingsAccounts = savingsAccount;
	}

	public CDAccount[] getCdAccount() {
		return cdAccount;
	}

	public void setCdAccount(CDAccount[] cdAccount) {
		this.cdAccount = cdAccount;
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
		str.append("SSN: " + getSSN() + "\n");
		
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