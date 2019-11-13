package bankaccountapp;

public abstract class Account implements IBaseRate {
	// List common properties for Savings and Checking Accounts
	private String name;
	private String sSN;
	private double balance;
	
	static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	// Constructor to set base properties and initialize the Account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposit; 
		
		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public void compound() {
		double accruedInterest = this.balance * (rate/100);
		this.balance = this.balance + accruedInterest;
		System.out.println("Accrued Interest: $ " + accruedInterest);
		printBalance();
	}
	
	// List common methods - transactions
	public void deposit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("Depositing $ " + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
		System.out.println("Withdrawing $ " + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		this.balance = this.balance - amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $" + this.balance);
	}
	
	
	public void showInfo() {
		System.out.println(
				"NAME: " + name + 
				"\nACCOUNT NUMBER: " + accountNumber + 
				"\nBALANCE: " + balance +
				"\nRATE: " + rate +  "%"
				);
	}
}
