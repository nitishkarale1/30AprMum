package Practice;

public class sample24_Exception_handling 
{
	public static void main(String[] args) 
	{
		String s1="INDIA";
		
		//System.out.println(s1.charAt(8));
		
		try
		{
			s1.charAt(8);
		}
		catch (Exception e)
		{
			System.out.println("Exception Handled");
			e.printStackTrace();
		}
		System.out.println(10*10);
		
		
	}
}
