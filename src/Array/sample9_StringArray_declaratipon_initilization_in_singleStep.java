package Array;

import java.util.Arrays;

public class sample9_StringArray_declaratipon_initilization_in_singleStep 
{
	public static void main(String[] args)
	{
		String [] D= {"Aurangabad","Pune","Mumbai","Nashik"};
	
		System.out.println(D[0]);
		
		System.out.println("----------");
		
		System.out.println(D.length);
		
		System.out.println("----------");
		
		for(int a=0; a<=D.length-1; a++)
		{
			System.out.println(D[a]);
		}
		
		System.out.println("----------");
		
		Arrays.sort(D);
		for(int b=0; b<=D.length-1; b++)
		{
			System.out.println(D[b]);
		}
		
		System.out.println("----------");
		
		for(int c=D.length-1; c>=0; c--)
		{
			System.out.println(D[c]);
		}
	}
	
	   
}
