package Multilevel_Inheritance;

public class sample22 extends sample21 
{
	int E;
	int F;
	
	sample22()
	{
		E=40;
		F=20;
	}
	
	public void division()
	{
		System.out.println(E/F);
	}
	
	public static void main(String[] args) 
	{
		sample22 R=new sample22();
		R.addition();
		R.subtraction();
		R.division();
	}
}
