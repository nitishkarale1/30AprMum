package Logical_Programs;

public class sample30_ReverseEachWordInStatement 
{
	public static void main(String[] args) 
	{
		String S1=" pooja is my good friend";
		
		String[] ar = S1.split(" ");
		
				
		for(int i=0; i<=ar.length-1; i++)
		{ 
			String org=ar[i];
			String rev=" ";
			
			for(int j=org.length()-1; j>=0; j--)
			{
				rev=rev+org.charAt(j);
			}
			System.out.print(rev+" ");
		}
		
		
	}
	
}
