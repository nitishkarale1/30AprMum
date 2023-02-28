package Method_overloading;

public class sample1 
{
	public void addition(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void addition(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public void addition(int a, int b, int c, int d)
	{
		System.out.println(a+b+c+d);
	}
	
	
	public static void main(String[] args) 
	{
		sample1 A=new sample1();
		A.addition(10, 15);
		System.out.println("-----");
		
		A.addition(5, 20, 25);
		System.out.println("-----");
		
		A.addition(10,20,30,40);
		System.out.println("-----");
	}
}
