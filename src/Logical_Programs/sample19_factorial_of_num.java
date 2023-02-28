package Logical_Programs;

import java.util.Scanner;

public class sample19_factorial_of_num 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter num: ");
		
		int num=sc.nextInt();
		
		int fact= 1;  //120
		    //  i=1    i>=1
		for(int i=num; i>=1; i--)
		{
			fact = fact * i; 
		}
		System.out.println(fact);
	}
}
