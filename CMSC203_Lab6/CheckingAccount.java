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

//Subclass: CheckingAccount extends BankAccount
public class CheckingAccount extends BankAccount {
	// Contain a static constant FEE => the cost of clearing one check.
	// Set it equal to 15 cents.
	private static final double FEE = 0.15;

	// Constructor: name and an initial amount as parameters. It
	public CheckingAccount(String name, double amount) {

		// Call the superclass constructor.
		super(name, amount);

		// Initialize accountNumber to be the current value in accountNumber
		// concatenated with –10
		// (All checking accounts at this bank are identified by the extension –10).
		String newAccountNumber = super.getAccountNumber() + "-10";

		// AccountNumber is a private member in BankAccount, it must be changed
		// through a mutator method
		// accountNumber is private in super class=> use setter
		super.setAccountNumber(newAccountNumber);
	}

	// Write a new instance method, withdraw, that overrides the withdraw method in
	// the superclass.
	@Override
	public boolean withdraw(double amount) {
		// Add fee to the withdrawal amount
		double totalAmount = amount + FEE;

		// Call superclass withdraw and return ít réult
		return super.withdraw(totalAmount);
	}
}
