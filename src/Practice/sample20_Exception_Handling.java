package Practice;

public class sample20_Exception_Handling 
{
	public static void main(String[] args) 
	{
		int A=10;
		int B=0;
		
		int C=0;
		
		
		try
		{
			C=A/B;
		}
		catch (ArithmeticException e) 
	    {
			System.out.println("Arithmetic_Exception Handled");
		}
     
		System.out.println("Have a Nice Day");
		
		
	}
}
