/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Inheritance
 * Due: 04/13/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: TRAN MINH CHAU LE
*/

//Subclass: SavingsAccount extends BankAccount
public class SavingsAccount extends BankAccount {

	// Annual interest rate=2.5%
	private double rate = 0.025;

	// Instance var savingsNumber initialized to 0
	// Each savings account for the same customer use the same base number with a
	// suffix
	private int savingsNumber = 0;

	// Instance var AccountNumber that hides the accountNumber from BankAccount
	private String accountNumber;

	// Constructor: name + initial balance
	public SavingsAccount(String name, double amount) {
		// Call superclass constructor
		super(name, amount);

		// Initialize accountNumber to superclass accountNumber + "-" + savingsNumber
		// Example: 100001-0 for the first savings account
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}

	// Copy constructor
	// create new savings account
	public SavingsAccount(SavingsAccount oldAccount, double amount) {

		// Call superclass copy constructor
		super(oldAccount, amount);

		// Assign savingsNumber to be 1 more than the original savings account
		this.savingsNumber = oldAccount.savingsNumber + 1;

		// Assign accountNumber to superclass accountNumber + "-" + new savingsNumber
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}

	// postInterest()
	// Calculates one month's interest and deposits it
	public void postInterest() {

		// Calculate Monthly interest
		double monthlyInterest = (super.getBalance() * rate) / 12;

		// Deposit interest
		super.deposit(monthlyInterest);
	}

	// Overrides getAccountNumber()
	// Return the hidden accountNumber

	@Override
	public String getAccountNumber() {
		return this.accountNumber;
	}

}
