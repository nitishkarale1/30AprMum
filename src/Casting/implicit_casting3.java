package Casting;

public class implicit_casting3 
{
	int s=5;
	float t=2.4f;
	
	long u=s;
	double v=t;
	
	public void multiplication()
	{
		System.out.println(u*v);
	}
	
	public static void main(String[] args) 
	{
		implicit_casting3 B=new implicit_casting3();
		B.multiplication();
	}
}
