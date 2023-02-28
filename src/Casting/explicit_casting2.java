package Casting;

public class explicit_casting2 
{
	long A=99l;
	int B=(int)A;
	
	double C=55.40d;
	float D=(float)C;
	
	public void subtraction()
	{
		System.out.println(B-D);
	}
	
	public static void main(String[] args) 
	{
		explicit_casting2 Z=new explicit_casting2();
		Z.subtraction();
	}
}
