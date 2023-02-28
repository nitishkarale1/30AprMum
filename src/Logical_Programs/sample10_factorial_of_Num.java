package Logical_Programs;

import java.util.Scanner;

public class sample10_factorial_of_Num
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		
		int fact=1;
		
		for(int i=num; i>=1; i--)
		{
			fact=fact * i ;
		}
		System.out.println(fact);
	}
}
