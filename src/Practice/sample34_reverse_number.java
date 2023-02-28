package Practice;

import java.util.Scanner;

public class sample34_reverse_number
{
	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = S.nextInt();
		
		int rev=0;
		
		for(int a=num; a>0; a=a/10)
		{
			int rem=a % 10;
			
			rev=rev+(rem*rem*rem);
		}
		if (num==rev)
		{
			System.out.println("given number "+num+" is a Armstrong number.");
		}
		else
		{
			System.out.println("given number "+num+" is not a Armstrong number.");
		}
	}
}
