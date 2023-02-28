package MethodWithReturnType;

public class sample5
{
	public static void main(String[] args) 
	{
		System.out.println(addition(5, 7));
		int D=addition(8, 6);
		System.out.println(D);
	}
	
	public static int addition(int a,int b)
	{
		int D=a+b;
		return D;
	}
}
