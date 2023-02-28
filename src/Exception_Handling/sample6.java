package Exception_Handling;

public class sample6
{
	public static void main(String[] args) 
	{
		String s1="abc";
		
		try
		{
			System.out.println(s1.charAt(6));
		}
		
		catch(StringIndexOutOfBoundsException a)
		{
			System.out.println("String Index Out Of Bounds Exception Handled");
		}
		
		System.out.println("Hii");
		
		
	}
}
