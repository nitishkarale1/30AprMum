package Logical_Programs;

import java.util.Scanner;

public class sample15_factorial_num 
{
	public static void main(String[] args) 
	{
		Scanner D=new Scanner(System.in);
		System.out.print("Enter Num: ");
		long num=D.nextInt();
		
		long fact=1;
		
		for(long i=num; i>=1; i--)
		{
			fact = fact * i; 
		}
		System.out.println(fact);
	}
	
}
