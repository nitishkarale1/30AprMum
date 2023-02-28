package Casting;

public class explicit_casting4 
{
	double A=15.50d;
	double B=12.40d;
	
	float C=(float)A;
	float D=(float)B;
	
	public void Subtraction()
	{
		System.out.println(A-B);
	}
	
	public static void main(String[] args)
	{
		explicit_casting4 S=new explicit_casting4();
		S.Subtraction();
	}
}