
abstract public class SavingsAccount extends BankAccount{
private boolean isSalaried;
private  static final float minbal=500;
public SavingsAccount(int accNo, int accNm, int accBal, boolean isSalaried) {
	super(accNo, accNm, accBal);
	this.isSalaried = isSalaried;
}
public float withdraw(float amt)
{
	return amt=getAccBal()-amt;
}

	
}
