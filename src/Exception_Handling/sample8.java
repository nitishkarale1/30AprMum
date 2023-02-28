package Exception_Handling;

public class sample8 
{
	public static void main(String[] args)
	{
		String s2="Nitish";
		
		try
		{
			System.out.println(s2.charAt(8));
		}		
		
		catch(Exception e)
		{
			System.out.println("Generic Exception Handled");
			e.printStackTrace();
		}
		
		
		System.out.println("Have a Nice Day");
		
	}
}
