package Method_overloading;

public class sample2 
{
	//method overloading
	public void multiplication(int a, int b)
	{
		System.out.println(a*b);
	}
	
	public void multiplication(int a, int b, int c)
	{
		System.out.println(a*b*c);
	}
	
	public void subtraction(int a, int b)
	{
		System.out.println(a-b);
	}
	
	public void subtraction(int a, int b, int c)
	{
		System.out.println(a-b-c);
	}
	
	public static void main(String[] args)
	{
		sample2 D=new sample2();
		D.multiplication(10,20);
		System.out.println("-----");
		
		D.multiplication(5,10,20);
		System.out.println("-----");
		
		D.subtraction(25,10);
		System.out.println("-----");
		
		D.subtraction(30,10,15);
		System.out.println("-----");
	}
	
}