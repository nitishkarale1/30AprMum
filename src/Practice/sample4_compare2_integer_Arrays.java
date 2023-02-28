package Practice;

import java.util.Arrays;

public class sample4_compare2_integer_Arrays
{
	public static void main(String[] args) 
	{
		int a1[]= {15,20,25,30};
		int a2[]= {15,20,30,35};
		int a3[]= {15,20,30,35};
		int a4[]= {25,45,15,35};
		
		System.out.println(Arrays.equals(a1, a2));
		System.out.println(Arrays.equals(a2, a3));
		System.out.println(Arrays.equals(a3, a4));
		System.out.println(a2==a3);
	}
}
