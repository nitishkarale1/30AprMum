package Logical_Programs;

public class sample33_ReverseEachWordInStatement 
{
	public static void main(String[] args) 
	{
		String s1="They are real Heroes";
		String[] ar = s1.split(" ");
		
		for (int i=0; i<=ar.length-1; i++)
		{
			String Org=ar[i];
			String rev=" ";
			
			for (int j=Org.length()-1; j>=0; j--) 
			{
				rev=rev+Org.charAt(j);
			}
			System.out.print(rev+" ");
		}
		
	}
	
}
