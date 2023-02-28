package Method3;

public class sample1 
{
	//method with parameter
	public static void main(String[] args) 
	{
		addition(10,20);
		addition(5,6);
		addition(100,200);
		
		System.out.println("---------------");
		
		sample1 s1=new sample1();
		s1.multiplication(7,8);
		s1.multiplication(10,11);
		s1.multiplication(9,5);
		
		System.out.println("---------------");
		
		sample2.substraction(40,5);
		sample2.substraction(7,15);
		
		System.out.println("---------------");
		
		sample2 s2=new sample2();
		s2.division(20,5);
		s2.division(45,15);
		
		
	}
	//method with int,int/(2int) parameter
	public static void addition (int a,int b) //static method call
	{
		System.out.println(a+b);
	}
	
	//method with int,int(2int) parameter
	public void multiplication (int a, int b)
	{
		System.out.println(a*b);
	}

}
