package Casting;

public class implicit_casting2 
{
	float A=5.5f;
	float B=4.2f;
	
	double C=A;
	double D=B;
	
	public void addition()
	{
		System.out.println(C+D);
	}
	
	public static void main(String[] args) 
	{
		implicit_casting2 F=new implicit_casting2();
		F.addition();
	}
}
