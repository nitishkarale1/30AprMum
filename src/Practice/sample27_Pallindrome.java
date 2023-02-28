package Practice;

import java.util.Scanner;

public class sample27_Pallindrome
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		System.out.println("Enter Name: ");
		String B=A.next();
		
		String C="";
		
		for(int s=B.length()-1; s>=0; s--)
		{
			C=C+B.charAt(s);		
		}
		if(B.equals(C))
		{
			System.out.println("Given String is Pallindrome");
		}
		else
		{
			System.out.println("Given String is not Pallindrome");
		}
	
	}
}
