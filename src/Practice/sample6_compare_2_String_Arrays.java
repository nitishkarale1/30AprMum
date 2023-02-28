package Practice;

import java.util.Arrays;

public class sample6_compare_2_String_Arrays
{
	public static void main(String[] args) 
	{
		String a[]= {"raj","ram","om"};
		String b[]= {"nikhil","nitin","nayan"};
		String c[]= {"raj","ram","om"};
		
		System.out.println(Arrays.equals(a,c));
		System.out.println(Arrays.equals(a, b));
	}
}
