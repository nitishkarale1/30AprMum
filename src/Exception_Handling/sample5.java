package Exception_Handling;

public class sample5 
{
	public static void main(String[] args)
	{
		int [] ar=new int[4];
		
		try
		{
		ar[6]=5;
		}
		catch(ArrayIndexOutOfBoundsException d)
		{
			System.out.println("Array Index Out Of Bounds Exception Handled");
		}
		
		System.out.println("Have a Nice Day");
	}
}
