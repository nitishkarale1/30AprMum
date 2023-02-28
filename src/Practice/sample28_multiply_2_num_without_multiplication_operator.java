
package Practice;

import java.util.Scanner;

public class sample28_multiply_2_num_without_multiplication_operator 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1: ");
		int A=sc.nextInt();
		System.out.println("enter num2: ");
		int B=sc.nextInt();
		
		int C=0;     //A=5, B=4
		
		for(int i=1; i<=A; i++)
		{
			C=C+B;
		}
		System.out.println(C);
		
	}
}
