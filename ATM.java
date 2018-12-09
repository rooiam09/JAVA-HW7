package atmMgmt;

//abstract class atm
abstract public class ATM {
	protected long ATMbalance=1000000;
	
	//methods
	public long checkBalance()
	{
		return ATMbalance;
	}

	protected boolean isValidAmount(long amount)
	{
		if(amount%500==0||amount%100==0||amount%2000==0)
			return true;
		return false;
	}
	public void makeTransfer(long amount) throws TransactionLimitExceeded {}
	public boolean checkPIN(String pwd) {return true;}
	public void deposit(long ATMbalance) {}
	public void withdraw(long ATMbalance) throws Exception {}
}
