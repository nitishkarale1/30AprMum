package MethodWithReturnType;

public class sample4
{
	public static void main(String[] args) 
	{
		int B=findtheLengthOfTheString("velocity");
		System.out.println(B);
		
		int C=findtheLengthOfTheString("class");
		System.out.println(C);
		
		int d=( B + C);
		System.out.println(d);
		
		
	}
	
	public static int findtheLengthOfTheString(String name)
	{
		int s1=name.length();
		return s1;
	}
}
