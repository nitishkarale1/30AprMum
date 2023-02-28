package Interface_Implementation_class;

public class sample12 implements I1,I2
{
	public void m1()
	{
		System.out.println("method m1 completed in IC");
	}
	
	public void m2()
	{
		System.out.println("method m2 completed in IC");
	}
	
	public void m3()
	{
		System.out.println("method m3 completed in IC");
	}
	
	public void m4()
	{
		System.out.println("method m4 completed in IC");
	}
	
	public static void main(String[] args) 
	{
		sample12 A=new sample12();
		A.m1();
		A.m2();
		A.m3();
		A.m4();
	}
}
