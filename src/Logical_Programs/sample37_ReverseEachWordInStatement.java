package Logical_Programs;

public class sample37_ReverseEachWordInStatement 
{
	public static void main(String[] args) 
	{
		String S1="Wonders Of The World";
		String[] ar = S1.split(" ");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String Org=ar[i];
			String Rev=reversestring(Org);
			
			System.out.print(Rev+" ");
		}
	}
	
	public static String reversestring(String Org)
	{
		String Rev=" ";
		for(int j=Org.length()-1; j>=0; j--)
		{
			Rev=Rev+Org.charAt(j);
		}
		return Rev;
	}
}
