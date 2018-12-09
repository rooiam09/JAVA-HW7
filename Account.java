package atmMgmt;
import java.util.Scanner;

// class to handle atm related transactions
public class Account extends ATM {
	public long balance,noOfTransactions=0; 
	private String password;
	
	//create pin method
	private void createPIN()
	{
		System.out.println("Type your new PIN");
		Scanner sc=new Scanner(System.in);
		password=sc.nextLine();
	}
	
	//deposit
	public void deposit(long amount)
	{
		balance+=amount;
		System.out.println(amount+" deposited succcessfully");
	}
	
	//withdraw
	public void withdraw(long amount) throws Exception
	{
		try {	
			
			if(amount>balance)
			{
				//Exception
				throw new InsufficientBalance("Sorry,you have insuffient balance");
			}
			else if(amount>ATMbalance)
			{
				//Exception
				throw new InsufficientATMBalance("Sorry,ATM has insuffient balance,try later");
			}
			else if(!isValidAmount(amount))
			{
				//Exception
				throw new InvalidDenomination("Please enter in multiples of 100,500 or 2000");
			}
			else
			{
				balance-=amount;
				System.out.println(amount+ "credited from account");
			}
		} 
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
	//check password
	public boolean checkPIN(String pwd)
	{
		if( pwd.equals(password) )
			return true;
		else
			return false;
	}
	
	//create pin for account;
	public Account()
	{
		createPIN();	
	}
	
	//return balance
	public long checkBalance()
	{
		return balance;
	}
	
	//check if transaction exceeded permitted 
	public void makeTransfer(long amount) throws TransactionLimitExceeded
	{
		try {
			noOfTransactions++;
			if(noOfTransactions>3)
			{
				//Exception
				throw new TransactionLimitExceeded("You have reached the limit of transactions for this month");
				
			}
			
		}
		catch(TransactionLimitExceeded ex)
		{
			System.out.println(ex);
		}
	}
}