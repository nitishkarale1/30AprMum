package MethodWithReturnType;


public class abc
{
	public static void main(String[] args)
	{
		int d=5;
		int sum=addition(10, 20);
		
		System.out.println(sum+d);
		
		int e=multiplication(4, 5);
		System.out.println(e*d);
	}
	
	public static int addition(int a, int b)
	{
		int sum=a+b;
		return sum;
		//System.out.println(sum);
	}
	public static int multiplication(int a,int b)
	{
		int x=a*b;
		return x;
 	}
}
