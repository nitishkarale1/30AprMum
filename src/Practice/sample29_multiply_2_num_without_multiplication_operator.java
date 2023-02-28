package Practice;

import java.util.Scanner;

public class sample29_multiply_2_num_without_multiplication_operator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1: ");
		int A=sc.nextInt();
		System.out.println("enter num2: ");
		int B=sc.nextInt();
		
		int D=0;
		
		for(int i=1; i<=A; i++)
		{
			D=D+B;
		}
		System.out.println(D);
	}
}
