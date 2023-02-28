package Control_Statements;

public class sample22_else_if 
{
	public static void main(String[] args) 
	{
		int marks=68;
	    
		if (marks>=65)
		{
			System.out.println("DISTINCTION");
		}
		
		else if(marks>=60 & marks<=64)
		{
			System.out.println("1st CLASS");
		}
		
		else if (marks>=50 & marks<=59)
		{
			System.out.println("2nd CLASS");
		}
		
		else if (marks>=35 & marks<=49)
		{
			System.out.println("PASS");
		}
		
		else if (marks<35)
		{
			System.out.println("FAIL");
		}
	}

}
