package Logical_Programs;

import java.util.Scanner;

public class sample9_even_odd 
{
	public static void main(String[] args) 
	{
		Scanner A1=new Scanner(System.in);
		System.out.print("Enter Num: ");
		
		int num=A1.nextInt();
		
		if(num % 2==0)
		{
			System.out.println("Given Number is Even");
		}
		else
		{
			System.out.println("Given Number is Odd");
		}
		
	}
}
