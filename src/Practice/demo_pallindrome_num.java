package Practice;

import java.util.Scanner;


public class demo_pallindrome_num
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		
		int org=sc.nextInt();
		
		int num=org;
		int rev=0;
		
		while(org>0)
		{
			int rem=org % 10;
			
			rev=rev * 10 + rem;
			
			org=org/10;	
		}
		System.out.println("Reverse number is: " + rev);
		
		if (org>0)
		{
			System.out.println("given number "+num+" is pallindrome" );
		}
		else
		{
			System.out.println("given number "+num+" is not pallindrome");
		}
		
		
	}
}
