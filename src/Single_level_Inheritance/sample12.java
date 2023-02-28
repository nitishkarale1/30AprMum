package Single_level_Inheritance;

public class sample12 extends sample11
{
	public void C()
	{
		System.out.println("333");
	}
	
	public void D()
	{
		System.out.println("444");
	}
	
	public static void main(String[] args) 
	{
		sample12 S=new sample12();
		S.A();
		S.B();
		S.C();
		S.D();
	}
}
