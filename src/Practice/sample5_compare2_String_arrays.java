package Practice;

import java.util.Arrays;

public class sample5_compare2_String_arrays
{
	public static void main(String[] args) 
	{
		String s1[]= {"sneha","prajakta","swati"};
		String s2[]= {"aarti","preeti","priya"};
		String s3[]= {"sneha","prajakta","swati"};
		
		System.out.println(Arrays.equals(s1, s2));
		System.out.println(Arrays.equals(s2, s3));
		System.out.println(Arrays.equals(s1, s3));
		
		
	}
}
