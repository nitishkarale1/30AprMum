package Logical_Programs;

import java.util.Scanner;

public class sample20_factorial_num 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num: ");
		int num=scan.nextInt();
		
		int fact=1;
		
		for (int i=num; i>=1; i--)
		{
			fact=fact * i;
		}
		System.out.println(fact);
	}
}
