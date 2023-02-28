package MethodWithReturnType;

public class sample3 
{
	public static void main(String[] args)
	{
		int l2=findTheLengthOfString("raghav");
		System.out.println(l2);
		System.out.println(findTheLengthOfString("raghav"));
		
		
		int l4=findIndexOfchar("rahul");
		System.out.println(l4);
		System.out.println(findIndexOfchar("prashant"));
		
	}
	
	public static int findTheLengthOfString(String name)
	{
		int l1=name.length();
		return l1;
	
	}
	
	public static int findIndexOfchar(String name)
	{
		int l3=name.indexOf("h");
		return l3;
	}
}
