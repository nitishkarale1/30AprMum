package Practice;

import java.util.Scanner;

public class sample8_reverse_String 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name: ");
		String A=sc.next();
		String B="";
		
		for(int i=A.length()-1; i>=0; i--)
		{
			B=B+A.charAt(i);
		}
		System.out.println("reverse output: ");
		System.out.println(B);
	}
}
