package Logical_Programs;

public class sample53_ReverseEvenOrOddIndexWordsInStatement 
{
	public static void main(String [] args)
	{
		String str1="we all are students";
		
		String [] ar=str1.split(" ");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String org=ar[i];
			// 0%2==0
			if(i%2==0)
			{
				String rev1=reverseString(org);
				System.out.print(rev1+" ");
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
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		return rev;
	}
}
