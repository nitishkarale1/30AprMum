package Array;

import java.util.Arrays;

public class sample6_intArray_DeclarationInitilization_in_singlestep
{
	public static void main(String[] args) 
	{
		//int array single step declaration and initilization
		int [] ar= {50,20,40,10,30};
		
        System.out.println("--print original data--");
        
		for(int i=0; i<=4; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("-----");

		System.out.println(ar.length);
		
		System.out.println("--print array data in ascending order--");
		
		Arrays.sort(ar);
		
		for(int i=0; i<=4; i++)
		{
			System.out.println(ar[i]);
		}
		
		
	}
}
