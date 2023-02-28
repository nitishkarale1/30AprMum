package Logical_Programs;

import java.util.Arrays;

public class example2_compare_2_String_Arrays 
{
	
	public static void main(String[] args) 
	{
		String X[]= {"rahul","akash","pratik"};
		String Y[]= {"mahesh","shubham","prasad"};
		String Z[]= {"rahul","akash","pratik"};
		
		System.out.println(Arrays.equals(X,Y));
		System.out.println(Arrays.equals(Y,Z));
		System.out.println(Arrays.equals(X,Z));
	
		System.out.println("--------");
		
		System.out.println(X.length);
		
	}
}
