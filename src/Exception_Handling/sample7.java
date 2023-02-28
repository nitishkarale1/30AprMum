package Exception_Handling;

public class sample7 
{
	public static void main(String[] args)
	{
		int [] ar=new int [4];
		
		try
		{
			ar[6]=5;
		}
		
		catch(StringIndexOutOfBoundsException b)
		{
			System.out.println("StringIndexOutOfIndexException Handled");
		}
		
		catch(ArithmeticException a)
		{
			System.out.println("Arithmetic exception Handled");
		}
		
		catch(ArrayIndexOutOfBoundsException c)
		{
			System.out.println("Array Index Out Of Bounds Exception Handled");
		}
		
		System.out.println("Have A Nice Day");
		
	}
}
