package JavaAssignment2;

public class TestAccountQ9 {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(101, 0.05);

		savingsAccount.deposit(1000);

		savingsAccount.addInterest();

		savingsAccount.printAccountDetails();

		HousingLoan housingLoan = new HousingLoan(201, 0.08, 20);

		housingLoan.deposit(200000);

		housingLoan.withdraw(50000);

		housingLoan.addInterest();

		housingLoan.printAccountDetails();

		housingLoan.printLoanTerms();
	}

}
