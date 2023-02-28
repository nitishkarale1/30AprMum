package Practice;

import Casting.implicit_casting1;

public class sample7 
{
	public static void main(String[] args) 
	{
		String A="NITISH";
		String B="";
		
		for(int i=A.length()-1; i>=0; i--)
		{
			B=B+A.charAt(i);
		}
		System.out.println(B);
	}

}
