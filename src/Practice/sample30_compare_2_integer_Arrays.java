
package Practice;

import java.util.Arrays;

public class sample30_compare_2_integer_Arrays
{
	public static void main(String[] args)
	{
		int A[]= {20, 40, 60, 80};
		int B[]= {30, 50, 70, 90};
		int C[]= {20, 40, 60, 80};
		
		System.out.println(Arrays.equals(A, B));
		
		System.out.println(Arrays.equals(B, C));
		
		System.out.println(Arrays.equals(A, C));
		
	}
}
