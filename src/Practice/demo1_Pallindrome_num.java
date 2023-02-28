package Practice;

import java.util.Scanner;

public class demo1_Pallindrome_num 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int A=sc.nextInt();
		
		int org=A;
		
		int rev=0; //3   32    321
		
		while(org>0)
		{
			int rem=org % 10;
			
			rev=rev*10 + rem;
			
			org=org/10;
		}
		System.out.println(rev);
		
		
		
	}
}
