package Interface_Implementation_class;

public class sample2 implements sample1
{
	public void addition()
	{
		System.out.println(b+c);
	}
	
	public void m1()
	{
		System.out.println("method m1 completed in IC");
	}
	
	public void m2()
	{
		System.out.println("method m2 completed in IC");
	}
	
	public static void main(String[] args)
	{
		sample2 A=new sample2();
		A.addition();
		A.m1();
		A.m2();
	}
}
