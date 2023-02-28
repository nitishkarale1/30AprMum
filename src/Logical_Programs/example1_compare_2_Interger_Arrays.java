package Logical_Programs;

import java.util.Arrays;

public class example1_compare_2_Interger_Arrays
{
	public static void main(String[] args) 
	{
		
		int A[]= {10,20,30,40};
		int B[]= {50,60,70,80};
		int C[]= {10,20,30,40};
	
//		Integer d=10;
//		Integer e=new Integer(10);
//		
//		System.out.println(B.length);
//		
//		System.out.println("---------");
//		
//		if (d==e)
//		{
//			System.out.println("True");
//		}
//		else 
//		{
//			System.out.println("False");
//		}
		
		System.out.println(Arrays.equals(A,B));
		System.out.println(Arrays.equals(B,C));
		System.out.println(Arrays.equals(A,C));
	}
}
