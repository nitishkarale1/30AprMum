package MethodWithReturnType;

public class sample7 
{
	public static void main(String[] args)
	{
		int A=5;
		int B=10;
		
		int X=addition(A, B);
		System.out.println(X);
		System.out.println(addition(A, B));
		System.out.println("----------------");
		
		sample7 s1=new sample7();
		int Y=s1.multiplication(15, 2);
		System.out.println(Y);
		System.out.println(s1.multiplication(15, 2));
		System.out.println("----------------");
		
		int Z=s1.multiplication(A, X, Y);
		System.out.println(Z);
		System.out.println(s1.multiplication(A, X, Y));
		System.out.println("----------------");
		
	}
	
	public static int addition(int a,int b)
	{
		int add=a+b;
		return add;
	}
	
	public int multiplication(int a, int b)
	{
		int sub=a*b;
		return sub;
	}
	
	public int multiplication(int a, int b, int c)
	{
		int sub1=a*b*c;
		return sub1;
	}
}
