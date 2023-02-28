package Practice;

import java.util.Scanner;

public class demo1_Reverse_num 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		System.out.println("Enter num: ");
		
		int num=A.nextInt();
		
		int org_num=num;
		
		int rev=0;
		
		while(num>0) 
		{
			int rem= num % 10;
			
			rev=rev * 10 + rem;
			
			num=num/10;
		}
		System.out.println(org_num);
		System.out.println(rev);
	}
}
