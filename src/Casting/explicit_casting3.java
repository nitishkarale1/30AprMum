package Casting;

public class explicit_casting3 
{
	double s=85.80d;
	float t=(float)s;
	
	long u=88l;
	int v=(int)u;
	
	public void addition()
	{
		System.out.println(t+v);
	}
	
	public static void main(String[] args)
	{
		explicit_casting3 G=new explicit_casting3();
		G.addition();
	}
}
