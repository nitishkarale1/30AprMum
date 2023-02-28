package Logical_Programs;

import java.util.Scanner;

public class sample8_even_odd 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num: ");
		int num=scan.nextInt();
		
	    if(num % 2==0)
		{
			System.out.println("given number is even");
		}
	    else
	    {
			System.out.println("given number is odd");
		}
		
	}
}
