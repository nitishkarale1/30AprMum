package Logical_Programs;

public class sample35_ReverseEachWordInStatement 
{
	public static void main(String[] args) 
	{
		String s1="We Are Good Friends";
		
		String[] ar = s1.split(" ");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String Org=ar[i];
			String Rev = reverseString(Org);
			
			System.out.print(Rev+" ");
		}
		
	}
	
	public static String reverseString(String Org)
	{
		String Rev=" ";
		for(int j=Org.length()-1; j>=0; j--)
		{
			Rev=Rev+Org.charAt(j);
		}
		return Rev;
	}
}
