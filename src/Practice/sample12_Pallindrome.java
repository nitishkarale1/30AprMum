package Practice;

import java.util.Scanner;

public class sample12_Pallindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name: ");
		String A =sc.next();
		
		String B="";
		
		for(int i=A.length()-1; i>=0; i--)
		{
			B=B+A.charAt(i);
		}
		
		if(A.equals(B))
		{
			System.out.println("given String is Pallindrome");
		}
		else
		{
			System.out.println("given String is not Pallindrome ");
		}
	}
}
