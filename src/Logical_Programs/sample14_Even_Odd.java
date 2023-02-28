package Logical_Programs;

import java.util.Scanner;

public class sample14_Even_Odd
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num=A.nextInt();
		
		if(num %  2 == 0)
		{
			System.out.println("Given Number is Even");
		}
		else
		{
			System.out.println("Givewn Number is Odd");
		}
		
		
	}
}
