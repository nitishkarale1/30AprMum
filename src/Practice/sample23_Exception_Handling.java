package Practice;

public class sample23_Exception_Handling
{
	public static void main(String[] args)
	{
		String s1="Rahul";
		
		System.out.println(s1.charAt(3));
		//System.out.println(s1.charAt(5));
		
		try 
		{
			s1.charAt(5);
		} 
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException Handled");
		}
		System.out.println("Welcome");
	
	}
}
