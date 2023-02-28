package Logical_Programs;

import java.util.Scanner;

public class sample21_factorial_of_num 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Num: ");
		int num=sc.nextInt();
		
		int B=1;
		
		for(int i=num; i>=1; i--)
		{
			B = B * i; 
		}
		System.out.println(B);
	
	}
}
