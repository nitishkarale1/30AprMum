package Multilevel_Inheritance;

public class sample32 extends sample31
{
	public void E()
	{
		System.out.println("mno");
	}
	
	public void F()
	{
		System.out.println("pqr");
	}
	
	public static void main(String[] args) 
	{
		sample32 S=new sample32();
		S.A();
		S.B();
		S.C();
		S.D();
		S.E();
		S.F();
	}
}
