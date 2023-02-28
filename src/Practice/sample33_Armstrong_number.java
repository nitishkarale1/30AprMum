package Practice;

import java.util.Scanner;

public class sample33_Armstrong_number
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int num = A.nextInt();
		
		int B=0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem=i % 10 ;
			
			B=B + (rem * rem *rem);
		}
		if(num==B)
		{
			System.out.println("given number "+num+" is a Armstrong number." );
		}
		else
		{
			System.out.println("given number "+num+" is not a Armstrong number.");
		}
		
	}
	
}
