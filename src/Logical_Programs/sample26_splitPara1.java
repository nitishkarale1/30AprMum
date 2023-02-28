package Logical_Programs;

public class sample26_splitPara1 
{
	public static void main(String[] args) 
	{
		String A="my name is abc";
		String[] ar = A.split(" ");
		
		System.out.println(ar[1]);
		
		System.out.println("-------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
	}
}
