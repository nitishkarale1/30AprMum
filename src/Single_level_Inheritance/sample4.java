package Single_level_Inheritance;

public class sample4 extends sample3
{
	public void E()
	{
		System.out.println("E=Sony");
	}
	
	public static void main(String[] args)
	{
		sample4 s1=new sample4();
		s1.E();
		s1.A();
		s1.B();
		s1.C();
		s1.D();
	}
	
	
}
