package Practice;

import java.util.Scanner;

public class sample26_reverse_String 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		String A=sc.next();
		
		//String s1="Velocity";
		
		String s2="";
		
		for(int i=A.length()-1; i>=0; i--)
		{
			s2=s2+A.charAt(i);
		}
		System.out.println(s2);
		
	}
}
