package Logical_Programs;

import java.util.Scanner;

public class sample20_factorial
{
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		
		System.out.println("Enter Num: ");
		
		int num=A.nextInt();
		
		int D=1;
		
		for(int i=num; i>=1; i--)
		{
			D = D * i;
		}
		System.out.println(D);
		
	}
}
