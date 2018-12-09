package atmMgmt;

//transaction limit exceeded exception
class TransactionLimitExceeded extends Exception {
	protected String msg;
	public TransactionLimitExceeded(String str)
	{
		msg=str;
	}
	public String toString()
	{
		return (msg);
	}
}
 
//insufficient balance exception
 class InsufficientBalance extends Exception
 {
	 public InsufficientBalance(String s)
	 {
		 super(s);
	 }
 }

 //wrong pin exception 
 class WrongPIN extends Exception
 {
	 public WrongPIN(String s)
	 {
		 super(s);
	 }
 }
 
 //in sufficient balance exception
 class InsufficientATMBalance extends Exception{
	 
 public InsufficientATMBalance(String s)
 {
	 super(s);
 }
	 
 }
 
 //invalid amount exception
 class InvalidDenomination extends Exception{
	 public InvalidDenomination(String s)
	 {
		 super(s);
	 }
	 
 }
 