import java.util.Scanner;

public class MoneyBankTestClass {
	public static void main(String args[]) {

		MoneyBank moneybank = new MoneyBank(0, 10000, null);
		Scanner scanner = new Scanner(System.in);
		//reading inputs from user
		System.out.println("Enter name and initial balance to open the account");
		String name = scanner.nextLine();
		double balance = scanner.nextDouble();
		System.out.println("Account has been created. Name:" + name);

		System.out.println("Inital balance=:" + balance);

		moneybank.setBalance(balance);
		moneybank.setAccountbalance(balance);

		System.out.println("Choose the option");

		System.out.println("1.Balance");
		System.out.println("2.Withdraw");
		System.out.println("3.Deposit");

		int choice;
		choice = scanner.nextInt();
		//calling methods based on user's choice
		switch (choice) {
		case 1:
			System.out.println("Balance=" + moneybank.getAccountbalance());
			break;
		case 2:
			System.out.println("Enter the amount to be withdrawn");
			double amount = scanner.nextDouble();

			amount = moneybank.withdraw(amount);
			if (amount == 0)

			{

				System.out.println("Insufficient balance");
			} else {

				System.out.println("Account Balance" + amount);
			}
			break;
		case 3:
			System.out.println("enter the amount to be deposited");
			double depositamt = scanner.nextDouble();
			moneybank.setBalance(depositamt);
			depositamt = moneybank.deposit(depositamt);
			System.out.println("Account Balance" + depositamt);
			break;
		}
	}

}
