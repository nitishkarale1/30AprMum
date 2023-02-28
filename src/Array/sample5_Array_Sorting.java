package Array;

import java.util.Arrays;

public class sample5_Array_Sorting 
{
	public static void main(String[] args)
	{
		int [] ar=new int[5];
		
		ar[0]=50;
		ar[1]=30;
		ar[2]=10;
		ar[3]=30;
		ar[4]=20;
		
		System.out.println("--print original data");
		
		for(int i=0; i<=4; i++) 
		{
			System.out.println(ar[i]);
		}
		
		Arrays.sort(ar);
		
		System.out.println("---print array in ascending order");
//		for(int i=0; i<=4; i++)
//		{
//			System.out.println(ar[i]);
//		}
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("--print array in descending order");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
	}
}
