package Array;

import java.util.Arrays;

public class sample7_StringArray_declaration_initilization_in_singlestep
{
	public static void main(String[] args)
	{
		String [] X= {"Rahul", "Mahesh","Ganesh","Prakash"};
		
		for(int i=0; i<=3; i++)
		{
			System.out.println(X[i]);
		}
		
		System.out.println(X.length);
		
		Arrays.sort(X);
		
		for(int i=0; i<=3; i++)
		{
			System.out.println(X[i]);
		}
	}
}
