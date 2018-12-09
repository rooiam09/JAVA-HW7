package gradeMgmt;

import java.util.Scanner;

public class StudentIndex {

	public static void main(String[] args) {
		
		//for UI
		String number[] = {"first", "second", "third", "fourth", "fifth"};
		
		//create object
		Students array = new Students();
		Scanner input = new Scanner(System.in);
		
		//try catch
		try {
			
			//taking input
			for(int i=0; i<5; i++)
			{
				System.out.println("enter name of " + number[i] + " student");
				String name = input.next();
				System.out.println("enter scores of " + number[i] + " student");
				double scores[]=new double[4];
				for(int j=0; j<4; j++)
				{
					scores[j]=input.nextInt();
				}
				
				array.setData(name, scores, i);
			}
			
			//for displaying
			for(int i=0; i<5; i++)
			{
				System.out.println("Name: " + array.getName(i));
				System.out.println("Marks: " + array.getAvgMarks(i));
				System.out.println("Grade: " + array.getGrade(i) + "\n");
			}
			
			//performing actions
			while(true)
			{
				System.out.println("1. Get name of student ");
				System.out.println("2. Get marks of student ");
				System.out.println("3. Get grade of student ");
				System.out.println("4. Exit");
				System.out.println("Make any choice ");
				int choice = input.nextInt(), index;
				switch(choice)
				{
				//get name of student
				case 1:
					System.out.println("Enter index ");
					index = input.nextInt();
					System.out.println(array.getName(index));
					break;
				//get marks of student 
				case 2:
					System.out.println("Enter index ");
					index = input.nextInt();
					System.out.println(array.getAvgMarks(index));
					break;
				//get grade of student
				case 3:
					System.out.println("Enter index ");
					index = input.nextInt();
					System.out.println(array.getGrade(index));
					break;
				case 4:
					return;
				}
			} 
		} finally {
			input.close();
		}
	}

}
