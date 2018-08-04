//program for performing withdraw and deposit function
public class MoneyBank {
	static int accountnumber;
	double accountbalance;
	String accountholdername;
	private double balance;

	public double getBalance() {
		return balance;
	}

//sets the initial balance given by user
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public MoneyBank(int i, int j, Object name) {
		accountnumber = i;
		accountbalance = j;
		accountholdername = (String) name;

	}

//returns the account balance
	public double getAccountbalance() {
		return accountbalance;
	}

	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}

//withdraw operation
	double withdraw(double withdrawamount) {
		if (accountbalance <= 0)
			return 0;
		else
			return accountbalance = accountbalance - withdrawamount;
	}

//deposit operation
	double deposit(double depositamount) {
		return accountbalance = accountbalance + depositamount;

	}

	static int getNextAccountNumber(int accountnumber) {
		return accountnumber += 1;
	}

}
