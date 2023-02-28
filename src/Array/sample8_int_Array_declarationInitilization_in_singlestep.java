package Array;

import java.util.Arrays;

public class sample8_int_Array_declarationInitilization_in_singlestep
{
	public static void main(String[] args) 
	{
		int [] Z= {300,400,100,500,200};
		
		System.out.println(Z[3]);
		
		System.out.println("-----");
		
		for (int i=0; i<=Z.length-1;i++)
		{
			System.out.println(Z[i]);
		}
		
		System.out.println("-----");
		
		Arrays.sort(Z);
		for(int j=0; j<=Z.length-1; j++)
		{
			System.out.println(Z[j]);
		}
		
		System.out.println("-----");
		
		for(int k=Z.length-1; k>=0; k--)
		{
			System.out.println(Z[k]);
		}
	}
}
