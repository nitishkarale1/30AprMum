package Exception_Handling;

public class sample4 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		
		int c=0;
		
		try
		{
			c=a/b;   //Risky code  //10/0
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Handled");
		}
		
		System.out.println(c);
		System.out.println("Hello");
	}
}
