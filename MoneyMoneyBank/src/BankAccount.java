
abstract public class BankAccount {
private int accNo;
private int accNm;
private int accBal;
public BankAccount(int accNo, int accNm, int accBal) {
	super();
	this.accNo = accNo;
	this.accNm = accNm;
	this.setAccBal(accBal);
}
public abstract float withdraw(float amt);
public abstract void deposit(float amt);
public abstract String toStringg();
public int getAccBal() {
	return accBal;
}
public void setAccBal(int accBal) {
	this.accBal = accBal;
}

}
