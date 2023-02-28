package Logical_Programs;

public class sample31_ReverseEachWordInStatement 
{
	public static void main(String[] args) 
	{
		String A="it is a very beautiful car";
		String[] ar = A.split(" ");
		
		for (int i=0; i<=ar.length-1; i++)
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
