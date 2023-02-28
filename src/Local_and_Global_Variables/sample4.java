package Local_and_Global_Variables;

public class sample4 
{
	static int a=10;
	
	public static void main(String[] args) 
	{
		System.out.println(a);
	
		System.out.println(sample3.b);
		
		sample4 D=new sample4();
		D.m2();
		sample4.m1();
		
	}
	
	public static void m1()
	{
		System.out.println(a);
	}
	
	public void m2()
	{
		System.out.println(a);
	}

}
