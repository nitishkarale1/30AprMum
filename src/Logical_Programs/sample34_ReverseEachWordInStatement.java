package Logical_Programs;

public class sample34_ReverseEachWordInStatement 
{
	public static void main(String[] args) 
	{
		String X="Mumbai is the financial capital of India";
		String[] ar = X.split(" ");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String Org=ar[i];
			String rev=" ";
			
			for(int j=Org.length()-1; j>=0; j--)
			{
				rev=rev+Org.charAt(j);
			}
			System.out.print(rev+" ");
		}
		
	}
	
}
