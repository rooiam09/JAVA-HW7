package atmMgmt;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws Exception {
		
		//for inputs
		Scanner sc=new Scanner(System.in);
		
		try {
			ATM user=new Account();
			System.out.println("Please Enter the PIN");
			String pwd=sc.nextLine();
			
			//if password is checked and matched
			if(user.checkPIN(pwd)) 
			{
				//while user do not exit
				while(true) 
				{
					long amount;
					//choices
					System.out.println("1.Deposit");
					System.out.println("2.Withdraw");
					System.out.println("3.Check Balance");
					System.out.println("4.Bank Transfer");
					System.out.println("5.Cancel Transaction");
					System.out.println("Choose the desired option");
					//end choices 
					
					int choice=sc.nextInt();
					switch(choice)
					{
						case 1:
							System.out.println("Enter the amount to be deposited");
							amount=sc.nextLong();
							user.deposit( amount);
							break;
							
						//amount to withdraw
						case 2:
							System.out.println("Enter the amount to be withdrawn");
							amount=sc.nextLong();
							user.withdraw(amount);
							break;
						
						//check balance
						case 3:
							System.out.println(user.checkBalance());
							break;
							
						//amount to be tranferred
						case 4:
							System.out.println("Enter the amount to be transferred");
							amount=sc.nextLong();
							user.makeTransfer(amount);
							break;
							
						//for exiting
						case 5:
							System.exit(0);
							break;
							
						default:
							System.out.println("Wrong choice!,try again ");
				    }//end switch
					
				   }//end while true
				}//end if
				else
					//Exception
					throw new WrongPIN("Wrong PIN");
			}//end try block
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			finally {
				sc.close();
			}
	}//end main
}//end class
