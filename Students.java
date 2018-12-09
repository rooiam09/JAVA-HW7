package gradeMgmt;

//student class
public class Students {
	
	//variable declarations
	String []name = new String[5];
	char []grade = new char[5];
	double [][]marks = new double[5][4];
	
	//method declarations
	void setData(String name, double marks[], int i)
	{
		this.name[i]=name;
		for(int j=0; j<4; j++)
		{
			this.marks[i][j] = marks[j];
		}
		this.grade[i] = this.getGrade(i);
	}
	
	//get name of student
	String getName(int index)
	{
		return name[index];
	}
	
	//get average marks
	double getAvgMarks(int index)
	{
		double avg=0;
		for(int i=0; i<4; i++)
		{
			avg+=marks[index][i];
		}
		
		avg = avg/4;
		return avg;
	}
	
	//get grades of a student
	char getGrade(int index)
	{
		double avg=getAvgMarks(index);
		char grade;
		if(avg<=59)
			grade = 'F';
		else
			grade = (char)('A' + (Math.ceil((100-avg)/10) -1));
		return grade;
	}
	
}
