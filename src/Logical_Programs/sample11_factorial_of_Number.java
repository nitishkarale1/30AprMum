package Logical_Programs;

import java.util.Scanner;

public class sample11_factorial_of_Number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Num :");
		long num=sc.nextInt();
		
		long fact=1;
		
		for(long i=num; i>=1; i--)
		{
			fact = fact * i ;
		}
		System.out.println(fact);
	}
}
