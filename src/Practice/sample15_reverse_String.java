package Practice;

import java.util.Scanner;

public class sample15_reverse_String
{
	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter Name");
		
		String A=S.next();
		
		String B="";
		
		for(int i=A.length()-1; i>=0; i--)
		{
			B=B+A.charAt(i);
		}
		System.out.println(B);
	}
}
