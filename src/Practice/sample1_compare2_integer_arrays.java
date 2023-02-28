package Practice;

import java.util.Arrays;

public class sample1_compare2_integer_arrays 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30};
		int b[]= {10,20,30};
		int c[]= {40,50,60};
		
		System.out.println(Arrays.equals(a, b));
		
		System.out.println(Arrays.equals(a, c));
	}
	
	
}
