package Logical_Programs;

public class sample28_splitPara3 
{
	public static void main(String[] args) 
	{
		String D="I live in aurangabd";
		String[] A = D.split(" ");
		
		System.out.println(A[1]);
		
		System.out.println("- - - - - - - - -");

		for (int i=0; i<=A.length-1; i++) 
		{
			System.out.println(A[i]);
		}
	}
}
