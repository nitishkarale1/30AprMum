package Logical_Programs;

public class sample38_ReverseEvenOrOddIndexWordsInStatement 
{
	public static void main(String[] args) 
	{
		String S1="she lives in banglore";
		String[] ar = S1.split(" ");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String org=ar[i];
			
			if(i%2 != 0)
			{
				String rev=reverseString(org);
				System.out.print(rev+" ");
			}
			
			else
			{
				System.out.print(org+" ");
			}
			
		}
		
		
	}
	
	public static String reverseString(String org) 
	{
		String rev=" ";
		for(int j=org.length()-1; j>=0; j--)
		{
			rev=rev+org.charAt(j);
		}
		return rev;
	}
	
}
