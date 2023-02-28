package MethodWithReturnType;

public class sample6 
{
	public static void main(String[] args) 
	{
		String B=convertNameToUpperCase("nitish");
		
		System.out.println(B);
		
		System.out.println("----------");
		
		boolean D=findContains("I love India");
		
		System.out.println(D);
		
	}
	public static String convertNameToUpperCase(String name)
	{
		String A=name.toUpperCase();
		return A;
	}
	public static boolean findContains(String name)
	{
		boolean A=name.contains("My");
		return A;
	}
}
