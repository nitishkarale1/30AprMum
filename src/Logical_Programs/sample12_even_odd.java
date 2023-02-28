package Logical_Programs;

import java.util.Scanner;

public class sample12_even_odd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter num: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Given Number is Even");
		}
		else
		{
			System.out.println("Given Number is Odd");
		}
	}
}
