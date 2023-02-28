package Casting;

public class explicit_casting1 
{
	long a=25l;
	int b=(int)a;
	
	double c=20.5d;
	float d=(float)c;
	
	
	public void addition()
	{
		System.out.println(b+d);
	}
	
	public static void main(String[] args)
	{
		explicit_casting1 R=new explicit_casting1();
		R.addition();
	}
}
