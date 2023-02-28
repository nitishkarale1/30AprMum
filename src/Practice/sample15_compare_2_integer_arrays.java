package Practice;

import java.util.Arrays;

public class sample15_compare_2_integer_arrays
{
	public static void main(String[] args) 
	{
		int a[]= {101,105,110};
		int b[]= {200,205,210};
		int c[]= {200,205,210};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		
	}
}
