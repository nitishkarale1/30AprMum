package MethodWithReturnType;

public class sample2
{
	public static void main(String[] args)
	{
		String s2=convertNameToUpperCase("akash");
		System.out.println(s2);
		
		System.out.println(convertNameToUpperCase("prakash"));
		
	}
	
	public static String convertNameToUpperCase(String name)
	{
		String s1=name.toUpperCase();
		return s1;
	}
}
