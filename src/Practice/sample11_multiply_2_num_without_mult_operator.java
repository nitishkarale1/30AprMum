package Practice;

import java.util.Scanner;

public class sample11_multiply_2_num_without_mult_operator 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		System.out.println("enter num1: ");
		int X=A.nextInt();
		System.out.println("enter num2: ");
		int Y=A.nextInt();
		
		int Z=0;
		
		for (int i=1; i<=X; i++ )
		{
		   Z=Z+Y;	
		}
		System.out.println("Multiplication: " + (Z));
	}
	
	
}
