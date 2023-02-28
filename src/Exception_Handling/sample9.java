package Exception_Handling;

public class sample9 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		
		int c=0;
		
		try
		{
		 c=a/b;
		}
		
		catch(ArrayIndexOutOfBoundsException x)
		{
			System.out.println("Array Index Out Of Bounds  Exception Handled");
		}
		
		catch(ArithmeticException y)
		{
			System.out.println("Arithmetc Exception Handled");
		}
		
		catch(Exception z)
		{
			System.out.println("Generic Exception Handled");
		}
		
		System.out.println("Have a Nice Day");
		
	}   
}
