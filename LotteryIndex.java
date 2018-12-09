package lotteryMgmt;

import java.util.Scanner;

public class LotteryIndex {
	//driver class for lottery management
	public static void main(String[] args) {
		Lottery lotteryNumbers = new Lottery();
		Scanner input = new Scanner(System.in);
		
		//try for handling exceptions
		try {
			while(true)
			{
				//performing actions
				System.out.println("1. Check the luck");
				System.out.println("2. Get the Lottery Numbers");
				System.out.println("3. some other time");
				System.out.println("Enter any option: ");
				
				//enter choice
				int choice = input.nextInt();
				
				//if matching lottery numbers
				if(choice == 1)
				{
					int userNumbers[] = new int[5];
					
					System.out.println("Enter 5 numbers (range 0-9)");
					for(int i=0; i<5; i++)
					{
						userNumbers[i] = input.nextInt();
					}
					
					int count = lotteryNumbers.checkResult(userNumbers);
					
					if(count == 5)
					{
						System.out.println("YOU ARE A GRAND PRIZE WINNER!!");
					}
					else
						System.out.println("you got " + count + " numbers same");
				}
				//get the lottery numbers
				else if(choice == 2)
				{
					//get lottery array
					int lotteryArray[] = lotteryNumbers.getLotteryArray();
					
					for(int i=0; i<5; i++)
					{
						System.out.print(lotteryArray[i] + " ");
					}
				}
				//for exiting
				else
					break;
			}
		} finally {
			input.close();
		}
		
	}

}

