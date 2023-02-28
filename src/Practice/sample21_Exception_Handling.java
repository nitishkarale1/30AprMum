
package Practice;


public class sample21_Exception_Handling 
{
	public static void main(String[] args) 
	{
		int s1[]= {10,20,30};
		
		
		//System.out.println(s1[7]);
		
		try 
		{
				s1[7]=0;
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArithmeticExceptoion Handled");
		}
		
		System.out.println("HII");
	}
}
