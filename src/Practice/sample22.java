package Practice;

public class sample22 
{
	public static void main(String[] args) 
	{
		int A[]= {10,20,30};
		
		try
		{
			A[6]=5;
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		System.out.println("hello nitish");
	}

}
