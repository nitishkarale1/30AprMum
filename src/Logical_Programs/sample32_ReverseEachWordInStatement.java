package Logical_Programs;

public class sample32_ReverseEachWordInStatement 
{
	public static void main(String[] args) 
	{
		String B="She is my Sister";
		
		String[] ar = B.split(" ");
		
		for(int a=0; a<=ar.length-1; a++)
		{
			String org=ar[a];
			String rev=" ";
			
			for(int b=org.length()-1; b>=0; b--)
			{
				rev=rev+org.charAt(b);
			}
			System.out.print(rev+" ");
		}
		
	}
}
