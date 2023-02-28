package user_defined_constructor;

public class sample15 
{
	int num1;
	int num2;
	
	//example of user defined constructor with parameter
	//use1:to initialize global variable
	//
	sample15(int a, int b)
	{
		num1=a;   //assign local variable value into globl variable
		num2=b;
	}
	
	public void addition()
	{
		System.out.println(num1+num2);
	}
	
	public void multiplication()
	{
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args) 
	{
		sample15 s1=new sample15(8,7);
		s1.addition();
		s1.multiplication();
	}
}
