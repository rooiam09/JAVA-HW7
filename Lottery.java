package lotteryMgmt;

import java.util.Random;

public class Lottery {
	int lotteryNumbers [];
	
	//constuctor for lottery
	Lottery()
	{
		lotteryNumbers = new int[5];
		Random rand = new Random();
		
		//traverse through all students
		for(int i=0; i<5; i++)
		{
			lotteryNumbers[i] = rand.nextInt(10);
		}
	}
	
	//return lottery number array
	int[] getLotteryArray()
	{
		return lotteryNumbers;
	}
	
	//check result of matching
	int checkResult(int userArray[])
	{
		int count=0;
		
		//hash for finding duplicate numbers
		Boolean hash[] = new Boolean[10];
		for(int i=0; i<10; i++)
		{
			hash[i]=true;
		}
		
		//check numbers which are same
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(userArray[i]==lotteryNumbers[j] && hash[userArray[i]])
				{
					count++;
					hash[userArray[i]]=false;
				}
			}
		}
		return count;
	}
}
