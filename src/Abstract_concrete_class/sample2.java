package Abstract_concrete_class;

public class sample2 extends sample1
{
	public void m2()
	{
		System.out.println("method m2 completed in IC");
	}
	
	public void m3()
	{
		System.out.println("method m3 completed in IC");
	}
	
	
	public static void main(String[] args) 
	{
		sample2 s1=new sample2();
		s1.m1();
		s1.m2();
		s1.m3();
	}
}
