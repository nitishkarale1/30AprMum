package Logical_Programs;

import java.util.Scanner;

public class sample57_prime_number 
{
	public static void main(String [] args)
	{
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int count=0;
		
		for(int i=2; i<num1; i++)
		{
			if(num1 % i == 0)
			{
				count++;
				break;
			}
		}
		
		if(count>0)
		{
			System.out.println("given no. is not a prime no.");
		}
		else
		{
			System.out.println("given no. is a prime no.");
		}
		
	}
	
}
