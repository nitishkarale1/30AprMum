package Practice;

import java.util.Arrays;

public class sample3_compare2_String_Arrays 
{
	public static void main(String[] args) 
	{
		String s1[]= {"abc","def","ghi","jkl"};
		String s2[]= {"xyz","def","ghk","fte"};
		String s3[]= {"abc","def","ghi","jkl"};
		
		System.out.println(Arrays.equals(s1, s2));
		System.out.println(Arrays.equals(s1,s3));
		
		System.out.println(Arrays.equals(s1,s3));
	}
}
