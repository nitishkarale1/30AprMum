package Logical_Programs;

public class sample36_ReverseEachWordInStatement 
{
	public static void main(String[] args) 
	{
		String A="My Name Is Nitish";
		
		String[] ar = A.split(" ");
		
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
