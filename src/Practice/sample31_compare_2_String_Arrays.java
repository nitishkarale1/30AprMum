package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class sample31_compare_2_String_Arrays
{
	public static void main(String[] args) 
	{
		int A[]= {1,2,3,4,5};
		int B[]= {4,3,2,6,5};
		int C[]= {9,5,4,6,8};
		int D[]= {4,3,2,6,5};
		
		System.out.println(Arrays.equals(A, B));
		System.out.println(Arrays.equals(B, C));
		System.out.println(Arrays.equals(C, D));
		System.out.println(Arrays.equals(C, A));
		System.out.println(Arrays.equals(D, A));
		System.out.println(Arrays.equals(D, B));
	}
}
