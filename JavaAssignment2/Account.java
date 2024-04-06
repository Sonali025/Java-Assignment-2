package JavaAssignment2;

public class Account {
	protected int accountNumber;

	protected double balance;



	public Account(int accountNumber) {

		this.accountNumber = accountNumber;

		this.balance = 0.0;

	}



	public void deposit(double amount) {

		balance += amount;

		System.out.println("Deposited " + amount + " into Account " + accountNumber);

	}



	public void withdraw(double amount) {

		if (balance >= amount) {

			balance -= amount;

			System.out.println("Withdrawn " + amount + " from Account " + accountNumber);

		} else {

			System.out.println("Insufficient balance");

		}

	}



	public void printAccountDetails() {

		System.out.println("Account Number: " + accountNumber);

		System.out.println("Balance: " + balance);

	}

}



class SavingsAccount extends Account {

	private double interestRate;



	public SavingsAccount(int accountNumber, double interestRate) {

		super(accountNumber);

		this.interestRate = interestRate;

	}



	public void addInterest() {

		balance += balance * interestRate;

		System.out.println("Interest added to Account " + accountNumber);

	}

}



class LoanAccount extends Account {

	private double interestRate;



	public LoanAccount(int accountNumber, double interestRate) {

		super(accountNumber);

		this.interestRate = interestRate;

	}



	public void addInterest() {

		balance += balance * interestRate;

		System.out.println("Interest added to Loan Account " + accountNumber);

	}

}



class HousingLoan extends LoanAccount {

	private int loanTerm;



	public HousingLoan(int accountNumber, double interestRate, int loanTerm) {

		super(accountNumber, interestRate);

		this.loanTerm = loanTerm;

	}



	public void printLoanTerms() {

		System.out.println("Loan Account Number: " + accountNumber);

		System.out.println("Loan Term: " + loanTerm + " years");

	}

}




