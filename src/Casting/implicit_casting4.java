package Casting;

public class implicit_casting4 
{
	float s=10f;
	float t=20f;
	
	double u=s;
	double v=t;
	
	public void addition()
	{
		System.out.println(u+v);
	}
	
	public static void main(String[] args)
	{
		implicit_casting4 A=new implicit_casting4();
		A.addition();
	}
}
