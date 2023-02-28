package Logical_Programs;

public class sample27_splitPara2
{
	public static void main(String[] args) 
	{
		String s1="nitish-machhindranath-karale";
		
		String[] ar = s1.split("-");
		
		System.out.println(ar[2]);
		System.out.println("----------------");
		
		for(int a=0; a<=ar.length-1; a++)
		{
			System.out.println(ar[a]);
		}
	}
}
