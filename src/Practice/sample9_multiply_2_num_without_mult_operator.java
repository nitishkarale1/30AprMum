package Practice;

import java.util.Scanner;

public class sample9_multiply_2_num_without_mult_operator
{
	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);
        System.out.println("enter num1: ");
		int A=sc.nextInt();
		System.out.println("enter num2: ");
        int B=sc.nextInt();		
		
        int C=0;    //8
        
        //int A=4;
        //int B=5;
                   //2<=4
		for(int i=1; i<=A; i++)
		{
			C=C+B;
		}
		System.out.println("Multiplication: ");
		System.out.println(C);
	}
}
