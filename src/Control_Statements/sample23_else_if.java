package Control_Statements;

public class sample23_else_if 
{
	public static void main(String[] args) 
	{
		int marks=68;
		if (marks>=55 & marks<=60)
		{
			System.out.println("1st Class");
		}
		
		else if (marks>=50 & marks<=54)
		{
			System.out.println("2nd Class");
		}
		
		else if (marks>=35 & marks<=49)
		{
			System.out.println("Pass");
		}
		
		else if (marks>=65)
		{
			System.out.println("Distinction");
		}
		
		else if (marks<35)
		{
			System.out.println("Fail");
		}
		
	}

}
