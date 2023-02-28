package user_defined_constructor;

public class sample11_WP 
{
	int num1;
	int num2;
	
	sample11_WP(int a, int b)
	{
		num1=a;
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
		sample11_WP s5=new sample11_WP(5,9);
		s5.addition();    
		s5.multiplication();
	}
}
