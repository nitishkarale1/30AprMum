package Control_Statements;

public class sample21_else_if 
{
	public static void main(String[] args) 
	{
		int marks = 62;
		
		// condition1
		if(marks>=65)
		{
			System.out.println("Distinction");
		}
		//condition2
		else if (marks>=60 & marks<=64)
		{
			System.out.println("1st class");
		}
		
		//condition3
		else if(marks>=50 & marks<=59)
		{
			System.out.println("2nd class");
		}
		
		
		//condition4
		else if(marks>=35 & marks<=49)
		{
			System.out.println("Pass");
		}
		//condition5
		else if(marks<35)
		{
			System.out.println("Fail");
		}
	}

}
