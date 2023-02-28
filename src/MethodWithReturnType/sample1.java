package MethodWithReturnType;

public class sample1 
{ 
	public static void main(String[] args)
	{
		int num1=10;
		int num2=20;
		
		int num4 = addition(5, 8);
		System.out.println(num4);
		
		sample1 s2=new sample1();
		int num7=s2.addition(num1,num2,num4);
		System.out.println(num7);
		
//		int num3=addition(5, 10);
//		System.out.println(num3);
//		System.out.println(addition(2, 8));
//		
		System.out.println("-------");
		
		int num5=s2.multiplication(num4, num7);
		System.out.println(num5);
	
	}
	
	public static int addition(int a,int b)
	{
		int num3=a+b;
		return num3;
		
	}
	
	public int addition(int a,int b, int c )
	{
		int num6=a+b+c;
		return num6;
	}
	
	public int multiplication(int a,int b)
	{
		int mulvalue=a*b;
		return mulvalue;
	}
	
	
	
}
