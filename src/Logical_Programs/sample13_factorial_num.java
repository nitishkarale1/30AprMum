package Logical_Programs;

import java.util.Scanner;

public class sample13_factorial_num
{
	public static void main(String[] args) 
	{
		Scanner D1=new Scanner(System.in);
		System.out.print("enter num: ");
		int num=D1.nextInt();
		
		int factorial=1;
		
		for(int j=num; j>=1; j--)
		{
			factorial = factorial*j ;
		}
		System.out.println(factorial);
	}
}
