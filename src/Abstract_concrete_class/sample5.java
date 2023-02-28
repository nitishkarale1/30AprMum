package Abstract_concrete_class;

public class sample5 extends sample4
{
	public void A()
	{
		System.out.println("method A completed in class sample5 ");
	}
	
	public void C()
	{
		System.out.println("method C completed in class sample5");
	}
	
	public static void main(String[] args)
	{
		sample5 s=new sample5();
		s.A();
		s.B();
		s.C();
		s.D();
	}
}
